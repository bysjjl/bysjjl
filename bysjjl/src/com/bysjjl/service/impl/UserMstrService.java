package com.bysjjl.service.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bysjjl.model.UserMstr;
import com.bysjjl.service.IUserMstrService;
import com.bysjjl.tools.DBUtil;

public class UserMstrService implements IUserMstrService {

	@Override
	public boolean checkNameRepeat(String userName) throws SQLException{
		Connection conn  = DBUtil.getConnection();
		PreparedStatement statement = conn.prepareStatement("select COUNT(1) from  usermstr where logonName =?");
		statement.setString(1, userName);
		ResultSet rs = statement.executeQuery();
		rs.next();
		int count = rs.getInt(1);
		// 关闭
		rs.close();
		statement.close();
		DBUtil.close();
		
		if(count >= 1){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public UserMstr logon(UserMstr userMstr) throws SQLException {
		Connection conn  = DBUtil.getConnection();
		PreparedStatement statement = conn.prepareStatement("select pword from usermstr  where logonName = ?");
		statement.setString(1, userMstr.getLogonName());
		ResultSet rs = statement.executeQuery();
		if(rs.next() && rs.getString(1).equals(userMstr.getPword())){
			rs.close();
			statement.close();
			DBUtil.close();
			return userMstr;
		}else{
			rs.close();
			statement.close();
			DBUtil.close();
			return null;
		}
		
	}

	@Override
	public UserMstr registr(UserMstr userMstr) throws SQLException {
		Connection conn  = DBUtil.getConnection();
		PreparedStatement statement = conn.prepareStatement
		("INSERT into usermstr(logonName,pword,limitPower,realName,phoneNo,email,qqNo,registTime)VALUES(?,?,?,?,?,?,?,?)");
		statement.setString(1, userMstr.getLogonName());
		statement.setString(2, userMstr.getPword());
		statement.setInt(3, userMstr.getLimitPower());
		statement.setString(4, userMstr.getRealName());
		statement.setString(5, userMstr.getPhoneNo());
		statement.setString(6, userMstr.getEmail());
		statement.setString(7, userMstr.getQqNo());
		statement.setTimestamp(8, userMstr.getRegisTime());
		userMstr.setId(statement.executeUpdate());
		statement.close();
		DBUtil.close();
		return userMstr;
	}

	@Override
	public UserMstr update(UserMstr userMstr) throws SQLException {
		Connection conn  = DBUtil.getConnection();
		PreparedStatement statement = conn.prepareStatement
		("update usermstr set limitPower=?,realName=?,phoneNo=?,email=?,qqNo=? where logonName =?");
		statement.setString(1, userMstr.getLogonName());
		statement.setString(2, userMstr.getPword());
		statement.setInt(3, userMstr.getLimitPower());
		statement.setString(4, userMstr.getRealName());
		statement.setString(5, userMstr.getPhoneNo());
		statement.setString(6, userMstr.getEmail());
		statement.setString(7, userMstr.getQqNo());
		statement.setTimestamp(8, userMstr.getRegisTime());
		userMstr.setId(statement.executeUpdate());
		statement.close();
		DBUtil.close();
		return userMstr;
	}

	@Override
	public List<UserMstr> getAll(int limitPower) throws SQLException {
		return null;
	}

	@Override
	public UserMstr search(String logonName) throws SQLException {
		return null;
	}

}
