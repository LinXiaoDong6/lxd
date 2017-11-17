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
import com.wuliu.models.Carmessage;
import com.wuliu.service.CarService;
import com.wuliu.serviceImpl.CarServiceImpl;

import net.sf.json.JSONObject;

/**
 * Servlet implementation class CarServlet
 */
@WebServlet("/CarServlet")
public class CarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CarService cas=new CarServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarServlet() {
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
			findCars(request, response);
		}else if("2".equals(act)){
			findCarOne(request, response);
		}else if("3".equals(act)){
			delCarOne(request, response);
		}
	}
	public void findCars(HttpServletRequest request, HttpServletResponse response) throws IOException{
		int currentNum=1;
		int pagesize=5;
		if(request.getParameter("num")!=null){
			currentNum=Integer.parseInt(request.getParameter("num"));	
		}
		Page page =cas.findCar(currentNum, pagesize);
		HttpSession session=request.getSession();
		session.setAttribute("page4", page);
		String root=request.getContextPath();
		response.sendRedirect(root+"/car.jsp");
	}
	public void findCarOne(HttpServletRequest request, HttpServletResponse response) throws IOException{
		int id=0;
		String temp=request.getParameter("id");
		if(temp!=null){
			id=Integer.parseInt(temp);
		}
		Carmessage act=cas.findCarById(id);
		
		String rs=JSONObject.fromObject(act).toString();
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(rs);
	}
	public void delCarOne(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String root=request.getContextPath();
		int id=0;
		String temp=request.getParameter("id");
		if(temp!=null){
			id=Integer.parseInt(temp);
		}
		boolean act=cas.delCarById(id);
	//	Carmessage act=cas.findCarById(id);
		
		String rs=JSONObject.fromObject(act).toString();
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(rs);
		this.findCars(request, response);
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
