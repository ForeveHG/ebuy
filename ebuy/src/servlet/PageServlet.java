package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MessageDAO;
import dao.impl.MessageDaoImpl;
public class PageServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		HttpSession session=request.getSession();
		int totalPage=0;
		int pageSize=3;
		//计算总页数
		try {
			MessageDAO md=new MessageDaoImpl();
			totalPage=md.countMessage();
			if(totalPage%pageSize==0){
				totalPage=totalPage/pageSize;
			}else{
				totalPage=totalPage/pageSize+1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//当前页
		String a=session.getAttribute("currPage").toString();
		int currPage=Integer.parseInt(a);
		//判断操作
		String op=request.getParameter("op");
		if("next".equals(op)){
			if(currPage>=totalPage){
				currPage=totalPage;
			}else{
				currPage++;
			}
			toMessage(request,response,currPage);
		}
		if("up".equals(op)){
			if(currPage<=1){
				currPage=1;
			}else{
				currPage--;
			}
			toMessage(request,response,currPage);
		}
	}
	
	public void toMessage(HttpServletRequest request, HttpServletResponse response,
			int currPage) throws IOException{
		HttpSession session=request.getSession();
		session.setAttribute("currPage", currPage);
		response.sendRedirect("MessageServlet?op=toMessage");
	}
	
}
