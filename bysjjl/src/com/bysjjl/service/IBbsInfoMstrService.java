package com.bysjjl.service;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import com.bysjjl.model.BbsInfoMstr;
import com.bysjjl.model.BbsInfoMstrModel;

public interface IBbsInfoMstrService {
	/*
	 * @param key,size,current
	 * @returnValue List<BbsInfoMstr>
	 * @describe 关键字查找（返回的是主贴）
	 */
	public BbsInfoMstrModel fuzzySearch(String key,int size,int current) throws SQLException;
	
	/*
	 * @param logonName
	 * @returnValue List<BbsInfoMstr>
	 * @describe 用户名查找
	 */
	public BbsInfoMstrModel searchByLogonName(String logonName,int size,int current) throws SQLException;
	
	/*
	 * @param start,end
	 * @returnValue List<BbsInfoMstr>
	 * @describe 时间段查找
	 */
	public BbsInfoMstrModel searchByTime(Timestamp start,Timestamp end,String logonName ,int size,int current) throws SQLException;
	
	/*
	 * @param type
	 * @returnValue List<BbsInfoMstr>
	 * @describe 类型查找
	 */
	public BbsInfoMstrModel searchByType(int type,int size,int current) throws SQLException;
	
	/*
	 * @param parentId
	 * @returnValue List<BbsInfoMstr>
	 * @describe 查找跟帖
	 */
	public BbsInfoMstrModel searchByParentId(int parentId,int size,int current) throws SQLException;
	
	/*
	 * @param mstr
	 * @returnValue boolean
	 * @describe 添加
	 */
	public boolean add(BbsInfoMstr mstr) throws SQLException;
	
	/*
	 * @param keyId
	 * @returnValue boolean
	 * @describe 删除
	 */
	public boolean delete(int keyId) throws SQLException;

}
