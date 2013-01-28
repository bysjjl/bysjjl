package com.bysjjl.service;

import java.sql.SQLException;
import java.util.List;

import com.bysjjl.model.UserMstr;

public interface IUserMstrService {
	
	/*
	 * @param userName
	 * @returnValue boolean
	 * @describe ����û����Ƿ��ظ�
	 */
	public boolean checkNameRepeat(String userName) throws SQLException;
	
	/*
	 * @param userMstr
	 * @returnValue UserMstr
	 * @describe  �û���¼
	 */
	public UserMstr logon(UserMstr userMstr) throws SQLException;
	
	/*
	 * @param userMstr
	 * @returnValue UserMstr
	 * @describe �û�ע��
	 */
	public UserMstr registr(UserMstr userMstr) throws SQLException;
	
	/*
	 * @param userMstr
	 * @returnValue UserMstr
	 * @describe  ������Ϣ
	 */
	public UserMstr update(UserMstr userMstr)throws SQLException;
	
	/*
	 * @param userMstr
	 * @returnValue UserMstr
	 * @describe  ��ѯ
	 */
	public UserMstr search(String logonName)throws SQLException;
	
	/*
	 * @param limitPower
	 * @returnValue List<UserMstr>
	 * @describe  ��ѯ
	 */
	public List<UserMstr> getAll(int limitPower)throws SQLException;
}
