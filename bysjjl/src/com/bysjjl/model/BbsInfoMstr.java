package com.bysjjl.model;

import java.sql.Timestamp;

public class BbsInfoMstr {
	private int id;  // �Զ�����
	private int parentId; // �գ�����     
	private String logonName; //  �����û�
	private String title;	//  ������title
	private String content; // ����
	private int type;	// ��������0- webӦ�ã�1-�ƶ����� ��2-�㷨���
	private Timestamp comtime; // �ύ��ʱ��
	
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
