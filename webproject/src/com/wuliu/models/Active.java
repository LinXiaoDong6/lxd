package com.wuliu.models;

public class Active {
	private int id;
	private String title;
	private String content;
	private String author;
	private String issueDate;
	private String style;
	public Active(){}
	public Active(int id, String title, String content, String author, String issueDate, String style) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.author = author;
		this.issueDate = issueDate;
		this.style = style;
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
	public void setContent(String tontent) {
		this.content = tontent;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	@Override
	public String toString() {
		return "Active [id=" + id + ", title=" + title + ", tontent=" +content + ", author=" + author + ", issueDate="
				+ issueDate + ", style=" + style + "]";
	}
	
	

}
