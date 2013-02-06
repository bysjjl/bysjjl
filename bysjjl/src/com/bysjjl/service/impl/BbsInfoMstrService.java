package com.bysjjl.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bysjjl.model.BbsInfoMstr;
import com.bysjjl.model.BbsInfoMstrModel;
import com.bysjjl.service.IBbsInfoMstrService;
import com.bysjjl.tools.DBUtil;
import com.bysjjl.tools.DateTool;

public class BbsInfoMstrService implements IBbsInfoMstrService {

	@Override
	public boolean add(BbsInfoMstr mstr) throws SQLException {
		Connection conn = DBUtil.getConnection();
		PreparedStatement statement = conn
				.prepareStatement("INSERT into bbsinfo (comtime,content,parentId,title,type,userName) VALUES(?,?,?,?,?,?)");
		statement.setTimestamp(1, mstr.getComtime());
		statement.setString(2, mstr.getContent());
		statement.setInt(3, mstr.getParentId());
		statement.setString(4, mstr.getTitle());
		statement.setInt(5, mstr.getType());
		statement.setString(6, mstr.getLogonName());
		boolean isInsert = statement.execute();
		statement.close();
		DBUtil.close();
		return isInsert;
	}

	@Override
	public boolean delete(int keyId) throws SQLException {
		Connection conn = DBUtil.getConnection();
		PreparedStatement statement = conn
				.prepareStatement("delete from bbsinfo WHERE id = ?");
		statement.setInt(1, keyId);
		boolean b = statement.execute();
		statement.close();
		DBUtil.close();
		return b;
	}

	@Override
	public BbsInfoMstrModel fuzzySearch(String key, int size, int current)
			throws SQLException {

		BbsInfoMstrModel model = new BbsInfoMstrModel();
		Connection conn = DBUtil.getConnection();
		PreparedStatement statement = conn
				.prepareStatement("select distinct parentId FROM bbsinfo where content LIKE ?");
		statement.setString(1, key);
		ResultSet rs = statement.executeQuery();
		StringBuffer sb = new StringBuffer();
		while (rs.next()) {
			sb.append(rs.getInt(1));
			sb.append(",");
		}
		sb.deleteCharAt(sb.lastIndexOf(","));
		// ---------------------------------------
		statement = conn
				.prepareStatement("select count(1) from bbsinfo where id in("
						+ sb.toString() + ") or title like ? or content like ? and parentId = 0");
		statement.setString(1, key);
		statement.setString(2, key);
		rs = statement.executeQuery();
		if (rs.next()) {
			model.setTotal(rs.getInt(1));
		}
		int start = (current - 1) * size;
		int end = current * size;
		statement = conn
				.prepareStatement("select id,comtime,content,title,type,userName from bbsinfo where id in("
						+ sb.toString()
						+ ") or title like ? or content like ? and parentId = 0  ORDER BY COMTIME DESC LIMIT "
						+ start + "," + end);
		statement.setString(1, key);
		statement.setString(2, key);
		rs = statement.executeQuery();
		List<BbsInfoMstr> bbsList = new ArrayList<BbsInfoMstr>();
		BbsInfoMstr bbs = null;
		while (rs.next()) {
			bbs = new BbsInfoMstr();
			bbs.setId(rs.getInt("id"));
			bbs.setComtime(rs.getTimestamp("comtime"));
			bbs.setContent(rs.getString("content"));
			bbs.setTitle(rs.getString("title"));
			bbs.setType(rs.getInt("type"));
			bbs.setLogonName(rs.getString("userName"));
			bbsList.add(bbs);
		}
		rs.close();
		statement.close();
		DBUtil.close();
		if (bbsList.size() == 0) {
			model.setBbsList(null);
		}
		model.setBbsList(bbsList);
		return model;
	}

	@Override
	public BbsInfoMstrModel searchByLogonName(String logonName, int size,
			int current) throws SQLException {
		BbsInfoMstrModel model = new BbsInfoMstrModel();
		int start = (current - 1) * size;
		int end = current * size;
		Connection conn = DBUtil.getConnection();
		PreparedStatement statement = conn
				.prepareStatement("select count(1) FROM bbsinfo where parentId = 0 and userName = ?");
		statement.setString(1, logonName);
		ResultSet rs = statement.executeQuery();
		if (rs.next()) {
			model.setTotal(rs.getInt(1));
		}

		statement = conn
				.prepareStatement("select id,comtime,content,title,type,userName FROM bbsinfo where parentId = 0 and userName = ? ORDER BY COMTIME DESC LIMIT "
						+ start + "," + end);
		statement.setString(1, logonName);
		rs = statement.executeQuery();
		List<BbsInfoMstr> bbsList = new ArrayList<BbsInfoMstr>();
		BbsInfoMstr bbs = null;
		while (rs.next()) {
			bbs = new BbsInfoMstr();
			bbs.setId(rs.getInt("id"));
			bbs.setComtime(rs.getTimestamp("comtime"));
			bbs.setContent(rs.getString("content"));
			bbs.setTitle(rs.getString("title"));
			bbs.setType(rs.getInt("type"));
			bbs.setLogonName(rs.getString("userName"));
			bbsList.add(bbs);
		}
		rs.close();
		statement.close();
		DBUtil.close();
		if (bbsList.size() == 0) {
			model.setBbsList(null);
		}
		model.setBbsList(bbsList);
		return model;
	}

	@Override
	public BbsInfoMstrModel searchByTime(Timestamp start, Timestamp end,
			String logonName, int size, int current) throws SQLException {
		BbsInfoMstrModel model = new BbsInfoMstrModel();
		int startIndex = (current - 1) * size;
		int endIndex = current * size;
		if (start == null) {
			start = DateTool.string2formatDate("2013-01-29");
		}
		if (end == null) {
			end = DateTool.dateTime2formatDate(new Date());
		}
		String sql = "select id,comtime,content,title,type,userName FROM bbsinfo where parentId =0  and comtime >'"
				+ start
				+ "' and comtime <'"
				+ end
				+ "' and userName = ? ORDER BY COMTIME LIMIT "
				+ startIndex
				+ "," + endIndex;
		Connection conn = DBUtil.getConnection();
		System.out.println(sql);
		PreparedStatement statement = conn
				.prepareStatement("select count(1) FROM bbsinfo where parentId =0  and comtime >'"
						+ start
						+ "' and comtime <'"
						+ end
						+ "' and userName = ?");
		statement.setString(1, logonName);
		ResultSet rs = statement.executeQuery();
		if (rs.next()) {
			model.setTotal(rs.getInt(1));
		}

		statement = conn.prepareStatement(sql);
		statement.setString(1, logonName);
		rs = statement.executeQuery();
		List<BbsInfoMstr> bbsList = new ArrayList<BbsInfoMstr>();
		BbsInfoMstr bbs = null;
		while (rs.next()) {
			bbs = new BbsInfoMstr();
			bbs.setId(rs.getInt("id"));
			bbs.setComtime(rs.getTimestamp("comtime"));
			bbs.setContent(rs.getString("content"));
			bbs.setTitle(rs.getString("title"));
			bbs.setType(rs.getInt("type"));
			bbs.setLogonName(rs.getString("userName"));
			bbsList.add(bbs);
		}
		rs.close();
		statement.close();
		DBUtil.close();
		if (bbsList.size() == 0) {
			model.setBbsList(null);
		}
		model.setBbsList(bbsList);
		return model;
	}

	@Override
	public BbsInfoMstrModel searchByType(int type, int size, int current)
			throws SQLException {
		BbsInfoMstrModel model = new BbsInfoMstrModel();
		int startIndex = (current - 1) * size;
		int endIndex = current * size;
		String sql = "select id,comtime,content,title,type,userName FROM bbsinfo where parentId = 0 and type = ? ORDER BY COMTIME DESC LIMIT "
				+ startIndex + "," + endIndex;
		Connection conn = DBUtil.getConnection();
		PreparedStatement statement = conn
				.prepareStatement("select count(1) FROM bbsinfo where parentId = 0 and type = ?");
		statement.setInt(1, type);
		ResultSet rs = statement.executeQuery();
		if (rs.next()) {
			model.setTotal(rs.getInt(1));
		}

		statement = conn.prepareStatement(sql);
		statement.setInt(1, type);
		rs = statement.executeQuery();
		List<BbsInfoMstr> bbsList = new ArrayList<BbsInfoMstr>();
		BbsInfoMstr bbs = null;
		while (rs.next()) {
			bbs = new BbsInfoMstr();
			bbs.setId(rs.getInt("id"));
			bbs.setComtime(rs.getTimestamp("comtime"));
			bbs.setContent(rs.getString("content"));
			bbs.setTitle(rs.getString("title"));
			bbs.setType(rs.getInt("type"));
			bbs.setLogonName(rs.getString("userName"));
			bbsList.add(bbs);
		}
		rs.close();
		statement.close();
		DBUtil.close();
		if (bbsList.size() == 0) {
			model.setBbsList(null);
		}
		model.setBbsList(bbsList);
		return model;
	}

	@Override
	public BbsInfoMstrModel searchByParentId(int parentId, int size, int current)
			throws SQLException {
		BbsInfoMstrModel model = new BbsInfoMstrModel();
		int startIndex = (current - 1) * size;
		int endIndex = current * size;
		String sql = "select id,comtime,content,title,type,userName FROM bbsinfo where parentId = ? ORDER BY COMTIME LIMIT "
				+ startIndex + "," + endIndex;
		Connection conn = DBUtil.getConnection();
		PreparedStatement statement = conn
				.prepareStatement("select count(1) FROM bbsinfo where parentId = ?");
		statement.setInt(1, parentId);
		ResultSet rs = statement.executeQuery();
		if (rs.next()) {
			model.setTotal(rs.getInt(1));
		}

		statement = conn.prepareStatement(sql);
		statement.setInt(1, parentId);
		rs = statement.executeQuery();
		List<BbsInfoMstr> bbsList = new ArrayList<BbsInfoMstr>();
		BbsInfoMstr bbs = null;
		while (rs.next()) {
			bbs = new BbsInfoMstr();
			bbs.setId(rs.getInt("id"));
			bbs.setComtime(rs.getTimestamp("comtime"));
			bbs.setContent(rs.getString("content"));
			bbs.setTitle(rs.getString("title"));
			bbs.setType(rs.getInt("type"));
			bbs.setLogonName(rs.getString("userName"));
			bbsList.add(bbs);
		}
		rs.close();
		statement.close();
		DBUtil.close();
		if (bbsList.size() == 0) {
			model.setBbsList(null);
		}
		model.setBbsList(bbsList);
		return model;
	}
}
