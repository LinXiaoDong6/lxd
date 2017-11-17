package com.wuliu.servlrts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wuliu.daoImpl.Page;
import com.wuliu.models.Active;
import com.wuliu.service.ActiveService;
import com.wuliu.serviceImpl.ActiveServiceImpl;

import net.sf.json.JSONObject;

/**
 * Servlet implementation class ActiveServlet
 */
@WebServlet("/ActiveServlet")
public class ActiveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private ActiveService acts=new ActiveServiceImpl();
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActiveServlet() {
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
			findActives(request,response);
		}else if("2".equals(act)){
			findActiveOne(request, response);
		}else if("3".equals(act)){
			delActiveById(request, response);
		}
	}
		private void findActives(HttpServletRequest request, HttpServletResponse response) throws IOException{
			int currentNum=1;
			int pagesize=2;
			if(request.getParameter("num")!=null){
				currentNum=Integer.parseInt(request.getParameter("num"));
			}	
			 Page page=acts.fingAllActive(currentNum, pagesize);
			 HttpSession session=request.getSession();
			 session.setAttribute("page1", page);
			 String root=request.getContextPath();
			 response.sendRedirect(root+"/active.jsp");
	
		}
		
		private void findActiveOne(HttpServletRequest request, HttpServletResponse response) throws IOException{
			int id=0;
			String temp=request.getParameter("id");
			if(temp!=null){
				id=Integer.parseInt(temp);
			}
			Active act=acts.fingActiveById(id);
			String rs=JSONObject.fromObject(act).toString();
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println(rs);
		}
		public void delActiveById(HttpServletRequest request, HttpServletResponse response) throws IOException{
			String root=request.getContextPath();
			int id=0;
			String temp=request.getParameter("id");
			if(temp!=null){
				id=Integer.parseInt(temp);
			}
			boolean act=acts.delActiveById(id);
		//	Carmessage act=cas.findCarById(id);
			
			String rs=JSONObject.fromObject(act).toString();
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println(rs);
			this.findActives(request, response);
			//response.sendRedirect(root+"/car.jsp");
			
		}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
