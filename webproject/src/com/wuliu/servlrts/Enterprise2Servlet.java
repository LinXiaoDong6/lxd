package com.wuliu.servlrts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wuliu.serviceImpl.EnterServiceImpl;
import com.wuliu.daoImpl.Page;
import com.wuliu.service.EnterService;

/**
 * Servlet implementation class Enterprise2Servlet
 */
@WebServlet("/Enterprise2Servlet")
public class Enterprise2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EnterService etpe = new EnterServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Enterprise2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String act=request.getParameter("act");
		if("1".equals(act)){
			findEnterprise(request, response);
		}
	}
	public void findEnterprise(HttpServletRequest request, HttpServletResponse response) throws IOException{
		int currPagenum =1;
		int pagesize=5;
		if(request.getParameter("num")!=null){
			currPagenum=Integer.parseInt(request.getParameter("num"));
		}
		Page page=etpe.findEnter(currPagenum, pagesize);
		HttpSession session=request.getSession();
		session.setAttribute("page5", page);
		String root=request.getContextPath();
		response.sendRedirect(root+"/qiye.jsp");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
