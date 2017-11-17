package com.wuliu.models;

public class Knowledge {
	private int id;
	private String title;
	private String content;
	private String issueDate;
	private String reside;
	public Knowledge(){}
	public Knowledge(int id, String title, String content, String issueDate, String reside) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.issueDate = issueDate;
		this.reside = reside;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getReside() {
		return reside;
	}
	public void setReside(String reside) {
		this.reside = reside;
	}
	@Override
	public String toString() {
		return "Knowledge [id=" + id + ", title=" + title + ", content=" + content + ", issueDate=" + issueDate
				+ ", reside=" + reside + "]";
	}
	
	
}
