package com.wuliu.models;

public class Goodsmeg {
	private int id;
	private String goodsStyle;
	private String goodsName;
	private String goodsNumber;
	private String goodsUnit;
	private String startOmit;
	private String startCity;
	private String endOmit;
	private String endCity;
	private String style;
	private String transportTime;
	private String phone;
	private String link;
	private String issueDate;
	private String remark;
	private String request;
	private String userName;

	public Goodsmeg() {}

	public Goodsmeg(int id, String goodsStyle, String goodsName, String goodsNumber, String goodsUnit, String startOmit,
			String startCity, String endOmit, String endCity, String style, String transportTime, String phone,
			String link, String issueDate, String remark, String request, String userName) {
		super();
		this.id = id;
		this.goodsStyle = goodsStyle;
		this.goodsName = goodsName;
		this.goodsNumber = goodsNumber;
		this.goodsUnit = goodsUnit;
		this.startOmit = startOmit;
		this.startCity = startCity;
		this.endOmit = endOmit;
		this.endCity = endCity;
		this.style = style;
		this.transportTime = transportTime;
		this.phone = phone;
		this.link = link;
		this.issueDate = issueDate;
		this.remark = remark;
		this.request = request;
		this.userName = userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoodsStyle() {
		return goodsStyle;
	}

	public void setGoodsStyle(String goodsStyle) {
		this.goodsStyle = goodsStyle;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsNumber() {
		return goodsNumber;
	}

	public void setGoodsNumber(String goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	public String getGoodsUnit() {
		return goodsUnit;
	}

	public void setGoodsUnit(String goodsUnit) {
		this.goodsUnit = goodsUnit;
	}

	public String getStartOmit() {
		return startOmit;
	}

	public void setStartOmit(String startOmit) {
		this.startOmit = startOmit;
	}

	public String getStartCity() {
		return startCity;
	}

	public void setStartCity(String startCity) {
		this.startCity = startCity;
	}

	public String getEndOmit() {
		return endOmit;
	}

	public void setEndOmit(String endOmit) {
		this.endOmit = endOmit;
	}

	public String getEndCity() {
		return endCity;
	}

	public void setEndCity(String endCity) {
		this.endCity = endCity;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getTransportTime() {
		return transportTime;
	}

	public void setTransportTime(String transportTime) {
		this.transportTime = transportTime;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Goodsmeg [id=" + id + ", goodsStyle=" + goodsStyle + ", goodsName=" + goodsName + ", goodsNumber="
				+ goodsNumber + ", goodsUnit=" + goodsUnit + ", startOmit=" + startOmit + ", startCity=" + startCity
				+ ", endOmit=" + endOmit + ", endCity=" + endCity + ", style=" + style + ", transportTime="
				+ transportTime + ", phone=" + phone + ", link=" + link + ", issueDate=" + issueDate + ", remark="
				+ remark + ", request=" + request + ", userName=" + userName + "]";
	}
	
	
	
	
	
}
