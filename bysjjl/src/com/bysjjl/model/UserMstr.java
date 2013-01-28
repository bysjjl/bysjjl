package com.bysjjl.model;

import java.sql.Timestamp;

//  table userMstr
public class UserMstr {
	private Integer id; // 自动增长Id
	private String logonName; // 用户登录名
	private String pword; // 登录密码
	private int limitPower; // 登录权限0-9逐次缩小
	private String realName; // 用户的真实姓名（为必填项）
	private String phoneNo; // 用户手机号码
	private String email; // 用户电子邮箱
	private char type; // （a-z）英文字母（暂时不用）
	private String qqNo; // qq账号
	private Timestamp regisTime; // 注册时间
	
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
