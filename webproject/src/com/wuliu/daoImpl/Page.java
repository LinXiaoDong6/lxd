package com.wuliu.daoImpl;
//ActiveServlet?act=1&num=${sessionScope.page1.currPagenum+1 }
import java.util.List;

public class Page {
	private int pagesize = 10;//ÿҳ����
	private int currPagenum = 1;//��ǰҳ��
	private int startIndex; //��ʼ�����ţ����㣩
	private int total; //�ܼ�¼��������ѯ��
	private int totalPages ;//��ҳ�������㣩
	private List<Object> list;//��¼���ϣ���ѯ��
	
	//��ӹ��췽��
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
	//ֻҪÿҳ�����仯����ʼ�������¼���
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
		getStart();
		getPages();
	}
	public int getCurrPagenum() {
		return currPagenum;
	}
	//ֻҪ��ǰҳ��仯����ʼ�������¼���
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
	//������ܼ�¼��ʱ��ȷ����ҳ��
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
	
	//������ʼ����
	public void getStart(){
		startIndex = (currPagenum-1) * pagesize;
	}
		
	//������ҳ��
	public void getPages(){
		this.totalPages = this.total / this.pagesize;
		if(this.total % this.pagesize !=0){
			this.totalPages++;
		}
	}
		
		
		
		
		
		
		
		
}	