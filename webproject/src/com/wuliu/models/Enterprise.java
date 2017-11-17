package com.wuliu.models;

public class Enterprise {
	private String enterpriseName;
	private String operation;
	private String workArea;
	private String address;
	private String phone;
	private int id;
	private String enterpriseSort;			
	private String linkMan;
	private String handSet;
	private String fax;
	private String email;
	private String http;
	private String intro;
	private String issueDate;
	private String userName;

	
	
	public Enterprise(){}



	public Enterprise(String enterpriseName, String operation, String workArea, String address, String phone, int id,
			String enterpriseSort, String linkMan, String handSet, String fax, String email, String http, String intro,
			String issueDate, String userName) {
		super();
		this.enterpriseName = enterpriseName;
		this.operation = operation;
		this.workArea = workArea;
		this.address = address;
		this.phone = phone;
		this.id = id;
		this.enterpriseSort = enterpriseSort;
		this.linkMan = linkMan;
		this.handSet = handSet;
		this.fax = fax;
		this.email = email;
		this.http = http;
		this.intro = intro;
		this.issueDate = issueDate;
		this.userName = userName;
	}



	public String getEnterpriseName() {
		return enterpriseName;
	}



	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}



	public String getOperation() {
		return operation;
	}



	public void setOperation(String operation) {
		this.operation = operation;
	}



	public String getWorkArea() {
		return workArea;
	}



	public void setWorkArea(String workArea) {
		this.workArea = workArea;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getEnterpriseSort() {
		return enterpriseSort;
	}



	public void setEnterpriseSort(String enterpriseSort) {
		this.enterpriseSort = enterpriseSort;
	}



	public String getLinkMan() {
		return linkMan;
	}



	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}



	public String getHandSet() {
		return handSet;
	}



	public void setHandSet(String handSet) {
		this.handSet = handSet;
	}



	public String getFax() {
		return fax;
	}



	public void setFax(String fax) {
		this.fax = fax;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getHttp() {
		return http;
	}



	public void setHttp(String http) {
		this.http = http;
	}



	public String getIntro() {
		return intro;
	}



	public void setIntro(String intro) {
		this.intro = intro;
	}



	public String getIssueDate() {
		return issueDate;
	}



	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	@Override
	public String toString() {
		return "Enterprise [enterpriseName=" + enterpriseName + ", operation=" + operation + ", workArea=" + workArea
				+ ", address=" + address + ", phone=" + phone + ", id=" + id + ", enterpriseSort=" + enterpriseSort
				+ ", linkMan=" + linkMan + ", handSet=" + handSet + ", fax=" + fax + ", email=" + email + ", http="
				+ http + ", intro=" + intro + ", issueDate=" + issueDate + ", userName=" + userName + "]";
	}
	
	
}
