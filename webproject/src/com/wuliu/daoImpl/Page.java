package com.wuliu.daoImpl;
//ActiveServlet?act=1&num=${sessionScope.page1.currPagenum+1 }
import java.util.List;

public class Page {
	private int pagesize = 10;//每页个数
	private int currPagenum = 1;//当前页码
	private int startIndex; //起始索引号（计算）
	private int total; //总记录个数（查询）
	private int totalPages ;//总页数（计算）
	private List<Object> list;//记录集合（查询）
	
	//添加构造方法
	public Page(){
		getStart();
	}
	public Page(int cpage){
		this.currPagenum = cpage;
		getStart();
	}
	public Page(int cpage, int psize){
		this.currPagenum = cpage;
		this.pagesize = psize;
		getStart();
	}
	
	
	public int getPagesize() {
		return pagesize;
	}
	//只要每页个数变化，起始索引重新计算
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
		getStart();
		getPages();
	}
	public int getCurrPagenum() {
		return currPagenum;
	}
	//只要当前页码变化，起始索引重新计算
	public void setCurrPagenum(int currPagenum) {
		this.currPagenum = currPagenum;
		getStart();
	}
	public int getStartIndex() {
		return startIndex;
	}
	
	public int getTotal() {
		return total;
	}
	//当获得总记录数时，确定总页数
	public void setTotal(int total) {
		this.total = total;
		getPages();
		
	}
	
	
	public int getTotalPages() {
		return totalPages;
	}
	
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	
	//计算起始索引
	public void getStart(){
		startIndex = (currPagenum-1) * pagesize;
	}
		
	//计算总页数
	public void getPages(){
		this.totalPages = this.total / this.pagesize;
		if(this.total % this.pagesize !=0){
			this.totalPages++;
		}
	}
		
		
		
		
		
		
		
		
}	