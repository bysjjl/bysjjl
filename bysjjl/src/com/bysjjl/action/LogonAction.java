package com.bysjjl.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bysjjl.model.UserMstr;
import com.bysjjl.service.IUserMstrService;
import com.bysjjl.service.impl.UserMstrService;

public class LogonAction extends HttpServlet {
    private IUserMstrService userMstrService;
    
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String type = (String) request.getAttribute("type");
		if(type.equals("logon")){
			logon(request,response);
		}else if(type.equals("register")){
			register(request,response);
		}else if(type.equals("update")){
			
		}else{
			checkRepeat(request,response);
		}
	}
	
	// 判断用户名是否重复
	private void checkRepeat(HttpServletRequest request,
			HttpServletResponse response) {
		
	}

	// 用户登录
	private void logon(HttpServletRequest request, HttpServletResponse response){
		userMstrService = new UserMstrService();
		UserMstr userMstr = (UserMstr)request.getAttribute("user");
		try {
			if(userMstrService.logon(userMstr) != null){
				// 登录成功
			}else{
				// 登录不成功
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 用户注册
	private void register(HttpServletRequest request, HttpServletResponse response){
		userMstrService = new UserMstrService();
		UserMstr userMstr = (UserMstr)request.getAttribute("user");
		try {
			if(userMstrService.registr(userMstr) != null){
				// 注册成功
			}else{
				// 注册失败
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 修改信息
	private void update(HttpServletRequest request, HttpServletResponse response){
		
	}
}
