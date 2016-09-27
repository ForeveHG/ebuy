package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginInfoDAO;
import dao.ManagerDAO;
import dao.impl.*;
import po.*;

@WebServlet(urlPatterns = "/useLogin")
public class userLogin extends HttpServlet {

	
	public userLogin() {
		super();
	}

	
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			String op=request.getParameter("op");
			
			if("lg".equals(op)){
				try {
					logins(request,response);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else if("reg".equals(op)){
				try {
					reg(request,response);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else if("edit".equals(op)){
				try {
					edit(request,response);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}

	public void init() throws ServletException {

		// Put your code here
	}
	
	private void edit(HttpServletRequest request, HttpServletResponse response)throws Exception {
		// TODO Auto-generated method stub
		
		
		
	}

	private void reg(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		
		
		
		
		
	}
	
	private void logins(HttpServletRequest request, HttpServletResponse response)throws Exception{

		String indent=request.getParameter("ident");
		LOGININFO use= new LOGININFO();
		LoginInfoDAO ud= new login();
		ManagerDAO us=new login();
		MANAGER man=new MANAGER();
		if("user".equals(indent)){
			use.setUloginname(request.getParameter("uloginname"));
			use.setUloginpwd(request.getParameter("uloginpwd"));
			try {
				boolean a=ud.checkuser(use);
				if(a==true){
					HttpSession session = request.getSession();
					session.setAttribute("USER", use);
					response.sendRedirect("index.jsp");
				}else{
					response.sendRedirect("login.jsp");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			man.setMname(request.getParameter("mname"));
			man.setMpwd(request.getParameter("mpwd"));
			try {
				boolean a=ud.checkuser(use);
				if(a==true){
					HttpSession session = request.getSession();
					session.setAttribute("man", man);
					response.sendRedirect("manager/index.jsp");
				}else{
					response.sendRedirect("manager/login.jsp");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
