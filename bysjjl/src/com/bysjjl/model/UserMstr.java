package com.bysjjl.model;

import java.sql.Timestamp;

//  table userMstr
public class UserMstr {
	private Integer id; // �Զ�����Id
	private String logonName; // �û���¼��
	private String pword; // ��¼����
	private int limitPower; // ��¼Ȩ��0-9�����С
	private String realName; // �û�����ʵ������Ϊ�����
	private String phoneNo; // �û��ֻ�����
	private String email; // �û���������
	private char type; // ��a-z��Ӣ����ĸ����ʱ���ã�
	private String qqNo; // qq�˺�
	private Timestamp regisTime; // ע��ʱ��
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogonName() {
		return logonName;
	}
	public void setLogonName(String logonName) {
		this.logonName = logonName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword = pword;
	}
	public int getLimitPower() {
		return limitPower;
	}
	public void setLimitPower(int limitPower) {
		this.limitPower = limitPower;
	}
	public String getQqNo() {
		return qqNo;
	}
	public void setQqNo(String qqNo) {
		this.qqNo = qqNo;
	}
	public Timestamp getRegisTime() {
		return regisTime;
	}
	public void setRegisTime(Timestamp regisTime) {
		this.regisTime = regisTime;
	}
}
