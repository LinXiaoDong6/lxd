package com.wuliu.servlrts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wuliu.daoImpl.Page;
import com.wuliu.models.Enterprise;
import com.wuliu.service.ActiveService;
import com.wuliu.service.CarService;
import com.wuliu.service.EnterService;
import com.wuliu.service.GoodService;
import com.wuliu.service.KnowService;
import com.wuliu.serviceImpl.ActiveServiceImpl;
import com.wuliu.serviceImpl.CarServiceImpl;
import com.wuliu.serviceImpl.EnterServiceImpl;
import com.wuliu.serviceImpl.GoodServiceImpl;
import com.wuliu.serviceImpl.KnowServiceImpl;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ActiveService act=new ActiveServiceImpl();
	private CarService car=new CarServiceImpl();
	private KnowService know=new KnowServiceImpl();
	private GoodService good=new GoodServiceImpl();
	private EnterService ent=new EnterServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int currentNum=1;
		int pagesize=5;
		Page page1=act.fingAllActive(currentNum, pagesize);
		Page page2=good.findGood(currentNum, pagesize);
		Page page3=know.findKnow(currentNum, pagesize);
		Page page4=car.findCar(currentNum, pagesize);
		Page page5=ent.findEnter(currentNum, pagesize);
		HttpSession session=request.getSession();
		session.setAttribute("page6",page1);
		session.setAttribute("page7",page2);
		session.setAttribute("page8",page3);
		session.setAttribute("page9",page4);
		session.setAttribute("page10",page5);
		String root=request.getContextPath();
		response.sendRedirect(root+"/index.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
