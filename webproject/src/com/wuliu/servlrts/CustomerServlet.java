package com.wuliu.servlrts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wuliu.service.CustomerService;
import com.wuliu.serviceImpl.CustomerServiceImpl;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CustomerService mana=new CustomerServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name =request.getParameter("name");
		String password =request.getParameter("password");
		String phone =request.getParameter("phone");
		String email =request.getParameter("email");
		String question =request.getParameter("question");
		String result =request.getParameter("result");
		String sex =request.getParameter("sex");
		String issueDate =request.getParameter("issueDate");
		String root=request.getContextPath();
		
		if(mana.findCustomer(name)==null){
			mana.addCustomer(name,password,email,sex,phone,question,result,issueDate);
			
			response.sendRedirect(root+"/index.jsp");
		}else{
		//	response.sendRedirect(root+"/register.jsp");
			//response.getWriter().println("´íÎó");
		}
		
	}

}
