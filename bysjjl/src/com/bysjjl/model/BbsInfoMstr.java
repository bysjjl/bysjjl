package com.bysjjl.model;

import java.sql.Timestamp;

public class BbsInfoMstr {
	private int id;  // 自动增长
	private int parentId; // 空：主贴     
	private String logonName; //  发帖用户
	private String title;	//  主贴的title
	private String content; // 内容
	private int type;	// 发帖类型0- web应用，1-移动开发 ，2-算法设计
	private Timestamp comtime; // 提交的时间
	
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
