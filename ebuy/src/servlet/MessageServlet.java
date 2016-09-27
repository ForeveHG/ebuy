package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import po.MESSAGE;
import dao.MessageDAO;
import dao.impl.MessageDaoImpl;

public class MessageServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		doPost(request,response);
		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String op=request.getParameter("op");
		if("toMessage".equals(op)){
			try {
				toMessage(request,response);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("跳转到留言页面错误！");
			}
		}
		out.flush();
		out.close();
	}
	
	public void toMessage(HttpServletRequest request, HttpServletResponse response)
			throws Exception{
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		int currPage=0;
		int pageSize=0;
		try{
			currPage=Integer.parseInt(request.getParameter("currPage"));
			pageSize=Integer.parseInt(request.getParameter("pageSize"));
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("页码错误！");
		}
		MessageDAO md=new MessageDaoImpl();
		List<MESSAGE> list=md.showMessage(currPage,pageSize);
		System.out.println(list.size());
		session.setAttribute("messList", list);
		session.setAttribute("currPage",currPage);
		response.sendRedirect("guestbook.jsp");
	}

}
