package com.wuliu.servlrts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wuliu.dao.CustomerDao;
import com.wuliu.daoImpl.CustomerDaoImpl;
import com.wuliu.models.Customer;
import com.wuliu.service.CustomerService;
import com.wuliu.serviceImpl.CustomerServiceImpl;

/**
 * Servlet implementation class Login3Servlet
 */
@WebServlet("/Login3Servlet")
public class Login3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService cus=new CustomerServiceImpl();
    private CustomerDao cd=new CustomerDaoImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login3Servlet() {
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
			request.setCharacterEncoding("utf-8");
			String act = request.getParameter("act");
			if("reg".equals(act)){
				registCutomer(request,response);
			}else if("login".equals(act)){
				loginCutomer(request,response);
			}
		}
		
		private void registCutomer(HttpServletRequest request, HttpServletResponse response) throws IOException{
			response.getWriter().println("regist go on....");
			
		}
		
		private void loginCutomer(HttpServletRequest request, HttpServletResponse response) throws IOException{
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			String root=request.getContextPath();
			//解决中文乱码
			name = new String(name.getBytes("iso-8859-1"),"utf-8");
			Customer c = cus.findCustomer(name);
			
			if(c==null ){
				out.println("用户名不存在");
			}else if(!c.getPassword().equals(password)){
				out.println("用户名或密码错误");
			}else{
				//out.println("欢迎"+c.getName());
				response.sendRedirect(root+"/Lin.jsp");
			}
		}
		}