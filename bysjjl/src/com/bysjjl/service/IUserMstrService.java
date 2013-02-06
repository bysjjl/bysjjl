package com.bysjjl.service;

import java.sql.SQLException;
import java.util.List;

import com.bysjjl.model.UserMstr;

public interface IUserMstrService {
	
	/*
	 * @param userName
	 * @returnValue boolean
	 * @describe 检查重复性
	 */
	public boolean checkNameRepeat(String userName) throws SQLException;
	
	/*
	 * @param userMstr
	 * @returnValue UserMstr
	 * @describe 登录
	 */
	public UserMstr logon(UserMstr userMstr) throws SQLException;
	
	/*
	 * @param userMstr
	 * @returnValue UserMstr
	 * @describe 注册
	 */
	public UserMstr registr(UserMstr userMstr) throws SQLException;
	
	/*
	 * @param userMstr
	 * @returnValue UserMstr
	 * @describe 更新
	 */
	public UserMstr update(UserMstr userMstr)throws SQLException;
	
	/*
	 * @param userMstr
	 * @returnValue UserMstr
	 * @describe 查找
	 */
	public UserMstr search(String logonName)throws SQLException;
	
	/*
	 * @param limitPower
	 * @returnValue List<UserMstr>
	 * @describe  ��ѯ
	 */
	public List<UserMstr> getAll(int limitPower)throws SQLException;
}
