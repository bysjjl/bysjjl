package com.bysjjl.model;

import java.sql.Timestamp;

public class BbsInfoMstr {
	private int id;  // 自动生成id
	private int parentId; // 主贴     
	private String logonName; // 发帖人
	private String title;	// 标题
	private String content; // 内同
	private int type;	// 贴的性质0- web开发-移动开发2-算法设计3
	private Timestamp comtime; // 发帖时间
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getLogonName() {
		return logonName;
	}
	public void setLogonName(String logonName) {
		this.logonName = logonName;
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Timestamp getComtime() {
		return comtime;
	}
	public void setComtime(Timestamp comtime) {
		this.comtime = comtime;
	}
}
