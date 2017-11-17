package com.wuliu.models;

public class Carmessage {
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLicenceNumber() {
		return licenceNumber;
	}

	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	private int code;
	private String tradeMark;
	private String brand;
	private String style;
	private String remark;
	private String issueDate;
	private String carLoad; 
	private String transpotStyle;	
	private String usedTime;
	private String driverName;
	private String driverTime;
	private String licenceNumber;
	private String licenceStyle;
	private String linkMan;
	private String linkPhone ;	
	private String userName ;
                                 
	public Carmessage(){}

	public Carmessage(int id,int code, String tradeMark, String brand, String style, String remark, String issueDate,
			String carLoad, String transpotStyle, String usedTime, String driverName, String driverTime,
			String licenceNumbe, String licenceStyle, String linkMan, String linkPhone, String userName) {
		super();
		this.id=id;
		this.code = code;
		this.tradeMark = tradeMark;
		this.brand = brand;
		this.style = style;
		this.remark = remark;
		this.issueDate = issueDate;
		this.carLoad = carLoad;
		this.transpotStyle = transpotStyle;
		this.usedTime = usedTime;
		this.driverName = driverName;
		this.driverTime = driverTime;
		this.licenceNumber = licenceNumber;
		this.licenceStyle = licenceStyle;
		this.linkMan = linkMan;
		this.linkPhone = linkPhone;
		this.userName = userName;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getTradeMark() {
		return tradeMark;
	}

	public void setTradeMark(String tradeMark) {
		this.tradeMark = tradeMark;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		brand = brand;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getCarLoad() {
		return carLoad;
	}

	public void setCarLoad(String carLoad) {
		this.carLoad = carLoad;
	}

	public String getTranspotStyle() {
		return transpotStyle;
	}

	public void setTranspotStyle(String transpotStyle) {
		this.transpotStyle = transpotStyle;
	}

	public String getUsedTime() {
		return usedTime;
	}

	public void setUsedTime(String usedTime) {
		this.usedTime = usedTime;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverTime() {
		return driverTime;
	}

	public void setDriverTime(String driverTime) {
		this.driverTime = driverTime;
	}

	public String getLicenceNumbe() {
		return licenceNumber;
	}

	public void setLicenceNumbe(String licenceNumbe) {
		this.licenceNumber = licenceNumbe;
	}

	public String getLicenceStyle() {
		return licenceStyle;
	}

	public void setLicenceStyle(String licenceStyle) {
		this.licenceStyle = licenceStyle;
	}

	public String getLinkMan() {
		return linkMan;
	}

	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}

	public String getLinkPhone() {
		return linkPhone;
	}

	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Carmessage [code=" + code + ", tradeMark=" + tradeMark + ", Brand=" + brand + ", style=" + style
				+ ", remark=" + remark + ", issueDate=" + issueDate + ", carLoad=" + carLoad + ", transpotStyle="
				+ transpotStyle + ", usedTime=" + usedTime + ", driverName=" + driverName + ", driverTime=" + driverTime
				+ ", licenceNumbe=" + licenceNumber + ", licenceStyle=" + licenceStyle + ", linkMan=" + linkMan
				+ ", linkPhone=" + linkPhone + ", userName=" + userName + "]";
	}

}