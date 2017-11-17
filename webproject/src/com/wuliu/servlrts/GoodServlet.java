package com.wuliu.servlrts;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wuliu.daoImpl.Page;
import com.wuliu.models.Active;
import com.wuliu.models.Goodsmeg;
import com.wuliu.service.GoodService;
import com.wuliu.serviceImpl.GoodServiceImpl;

import net.sf.json.JSONObject;

/**
 * Servlet implementation class GoodServlet
 */
@WebServlet("/GoodServlet")
public class GoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private GoodService acts=new GoodServiceImpl();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String act=request.getParameter("act");
		//1分页  2 详情  3 删除   4添加
		if("1".equals(act)){
			findGoodAll(request, response);
		}else if("2".equals(act)){
			findGoodOne(request, response);
		}else if("3".equals(act)){
			delGoodById(request, response);
		}else if("4".equals(act)){
			addGood(request, response);
		}
	}
	public void findGoodAll(HttpServletRequest request, HttpServletResponse response) throws IOException{
		int currPagenum=1;
		int pagesize=7;
		if(request.getParameter("num")!=null){
			currPagenum=Integer.parseInt(request.getParameter("num"));
		}
		Page page=acts.findGood(currPagenum, pagesize);
		HttpSession session=request.getSession();
		session.setAttribute("page2", page);
		String root=request.getContextPath();
		response.sendRedirect(root+"/goodsshow.jsp");
	}
	
	public void findGoodOne(HttpServletRequest request, HttpServletResponse response) throws IOException{
		int id=0;
		String temp=request.getParameter("id");
		if(temp!=null){
			id=Integer.parseInt(temp);
		}
		Goodsmeg act=acts.findGoodById(id);
		
		String rs=JSONObject.fromObject(act).toString();
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(rs);
	}
	
	public void delGoodById(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String root=request.getContextPath();
		int id=0;
		String temp=request.getParameter("id");
		if(temp!=null){
			id=Integer.parseInt(temp);
		}
		boolean act=acts.delGoodById(id);
	//	Carmessage act=cas.findCarById(id);
		
		String rs=JSONObject.fromObject(act).toString();
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(rs);
		this.findGoodAll(request, response);
	}
	
	public void addGood(HttpServletRequest request, HttpServletResponse response) throws IOException{
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		String date = dateFormat.format( now ); 
		Goodsmeg u = new Goodsmeg();
			u.setGoodsStyle(request.getParameter("gclass"));
			u.setGoodsName(request.getParameter("gname"));
			u.setGoodsNumber(request.getParameter("gcount"));
			u.setGoodsUnit(request.getParameter("gunit"));
			u.setStartOmit(request.getParameter("gstartfirm"));
			u.setStartCity(request.getParameter("gstartcity"));
			u.setEndOmit(request.getParameter("gendfirm"));
			u.setEndCity(request.getParameter("gendcity"));
			u.setStyle(request.getParameter("gtransstyle"));
			u.setTransportTime(request.getParameter("gtime"));
			u.setPhone(request.getParameter("gphone"));
			u.setLink(request.getParameter("glink"));
			u.setIssueDate(date);
			u.setRemark(request.getParameter("gremark"));
			u.setRequest(request.getParameter("grequest"));
			u.setUserName(request.getParameter("glink"));
			boolean b = acts.addGoodById(u);
			String root=request.getContextPath();
			response.sendRedirect(root+"/goodsshow.jsp");
//			if(b){
			
//				response.setContentType("text/html;charset=utf-8");
//				response.getWriter().print("<h1>添加成功,5秒后自动跳转</h1>");
//				response.setHeader ("refresh", "5;URL=goodsshow.jsp");
//			}else{
//				response.setContentType("text/html;charset=utf-8");
//				response.getWriter().print("<h1>添加失败,5秒后回到原页面</>");
//				response.setHeader ("refresh", "5;URL=goods.jsp");
//			}
		
	}
	/**
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
