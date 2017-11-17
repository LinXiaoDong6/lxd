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
import com.wuliu.models.Knowledge;
import com.wuliu.service.KnowService;
import com.wuliu.serviceImpl.KnowServiceImpl;

import net.sf.json.JSONObject;

/**
 * Servlet implementation class KnowServlet
 */
@WebServlet("/KnowServlet")
public class KnowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private KnowService kno =new KnowServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KnowServlet() {
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
			findKnows(request, response);
		}else if("2".equals(act)){
			findKnowOne(request, response);
		}else if("3".equals(act)){
			delKnowById(request, response);
		}	
	}
	
	public void findKnows(HttpServletRequest request, HttpServletResponse response) throws IOException{
		int currPagenum=1;
		int pagesize=5;
		if(request.getParameter("num")!=null){
			currPagenum=Integer.parseInt(request.getParameter("num"));
		}
		Page page=kno.findKnow(currPagenum, pagesize);
		HttpSession session=request.getSession();
		session.setAttribute("page3", page);
		String root=request.getContextPath();
		response.sendRedirect(root+"/knowledge.jsp");
	}
	public void findKnowOne(HttpServletRequest request, HttpServletResponse response) throws IOException{
		int id=0;
		String temp=request.getParameter("id");
		if(temp!=null){
			id=Integer.parseInt(temp);
		}
		Knowledge act=kno.findKnowById(id);
		String rs=JSONObject.fromObject(act).toString();
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(rs);
	}
	public void delKnowById(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String root=request.getContextPath();
		int id=0;
		String temp=request.getParameter("id");
		if(temp!=null){
			id=Integer.parseInt(temp);
		}
		boolean act=kno.delKnowById(id);
	//	Carmessage act=cas.findCarById(id);
		
		String rs=JSONObject.fromObject(act).toString();
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(rs);
		this.findKnows(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
