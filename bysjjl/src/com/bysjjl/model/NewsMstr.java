package com.bysjjl.model;

import java.sql.Timestamp;

public class NewsMstr {
	private int id;
	private String title;	// 标题 
	private String content;	// 内容简介
	private String link;	// 网页链接
	private String imageUrl;	// 图片的存放路劲
	private Timestamp update;	// 更新的时间
	
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
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Timestamp getUpdate() {
		return update;
	}
	public void setUpdate(Timestamp update) {
		this.update = update;
	}
}
