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
import com.wuliu.models.Enterprise;
import com.wuliu.service.EnterService;
import com.wuliu.serviceImpl.EnterServiceImpl;

import net.sf.json.JSONObject;

/**
 * Servlet implementation class EnterServlet
 */
@WebServlet("/EnterServlet")
public class EnterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private EnterService ent=new EnterServiceImpl();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnterServlet() {
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
			findEnter(request, response);
		}else if("2".equals(act)){
			findEnterOne(request, response);
		}else if("3".equals(act)){
			delEnterById(request, response);
		}
	}
	public void findEnter(HttpServletRequest request, HttpServletResponse response) throws IOException{
		int currentNum =1;
		int pagesize=5;
		if(request.getParameter("num")!=null){
			currentNum=Integer.parseInt(request.getParameter("num"));
		}
		Page page=ent.findEnter(currentNum, pagesize);
		HttpSession session=request.getSession();
		session.setAttribute("page5", page);
		String root=request.getContextPath();
		response.sendRedirect(root+"/enter.jsp");
	}
	public void findEnterOne(HttpServletRequest request, HttpServletResponse response) throws IOException{
		int id=0;
		String temp=request.getParameter("id");
		if(temp!=null){
			id=Integer.parseInt(temp);
		}
		Enterprise act=ent.findEnterById(id);
		
		String rs=JSONObject.fromObject(act).toString();
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(rs);
	}
	public void delEnterById(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String root=request.getContextPath();
		int id=0;
		String temp=request.getParameter("id");
		if(temp!=null){
			id=Integer.parseInt(temp);
		}
		boolean act=ent.delEnterById(id);
	//	Carmessage act=cas.findCarById(id);
		
		String rs=JSONObject.fromObject(act).toString();
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(rs);
		this.findEnter(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
