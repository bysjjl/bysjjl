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
	
	// �ж��û����Ƿ��ظ�
	private void checkRepeat(HttpServletRequest request,
			HttpServletResponse response) {
		
	}

	// �û���¼
	private void logon(HttpServletRequest request, HttpServletResponse response){
		userMstrService = new UserMstrService();
		UserMstr userMstr = (UserMstr)request.getAttribute("user");
		try {
			if(userMstrService.logon(userMstr) != null){
				// ��¼�ɹ�
			}else{
				// ��¼���ɹ�
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// �û�ע��
	private void register(HttpServletRequest request, HttpServletResponse response){
		userMstrService = new UserMstrService();
		UserMstr userMstr = (UserMstr)request.getAttribute("user");
		try {
			if(userMstrService.registr(userMstr) != null){
				// ע��ɹ�
			}else{
				// ע��ʧ��
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// �޸���Ϣ
	private void update(HttpServletRequest request, HttpServletResponse response){
		
	}
}
