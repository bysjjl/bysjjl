package com.bysjjl.model;

import java.sql.Timestamp;

//  table userMstr
public class UserMstr {
	private Integer id; //	自动生成id
	private String logonName; // 用户登录名
	private String pword; // 密码
	private int limitPower; // 权限级别0-9依次递减
	private String realName; // 真实姓名
	private String phoneNo; //	手机号码
	private String email; // 	电子邮件
	private char type; // 类型a-z 暂时无用
	private String qqNo; // qq号码
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
