package com.bysjjl.action;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
		String type = (String) request.getParameter("type");
		if(type.equals("logon")){
			logon(request,response);
		}else if(type.equals("register")){
			register(request,response);
		}else if(type.equals("update")){
			update(request, response);
		}else{
			checkRepeat(request,response);
		}
	}
	
	// 检查用户名是否重复
	private void checkRepeat(HttpServletRequest request,
			HttpServletResponse response) {
		
	}

	// 登录操作
	private void logon(HttpServletRequest request, HttpServletResponse response){
		userMstrService = new UserMstrService();
		UserMstr userMstr = (UserMstr)request.getAttribute("user");
		//先验证验证码
//		String ccode=(String)request.getSession().getAttribute("ccode");
//		String checkcode=userForm.getValidateCode();
//		if(!(ccode.equals(checkcode))){
//			ActionMessages errors = new ActionMessages();
//			errors.add("checkcode", new ActionMessage("checkcode.error"));
//			super.saveErrors(request, errors);
//			//request.setAttribute("validateerror", "validatecodeerror");
//			return mapping.findForward("fail");
//		}
		try {
			if(userMstrService.logon(userMstr) != null){
				// 登录成功
			}else{
				// 登录失败
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 注册操作
	private void register(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException{
		userMstrService = new UserMstrService();
		UserMstr userMstr = new UserMstr();
		String logonName = request.getParameter("logonName");
		String pword = request.getParameter("pword");
		String realName = request.getParameter("realName");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String qqNum = request.getParameter("qqNum");
		userMstr.setLogonName(logonName);
		userMstr.setPword(pword);
		userMstr.setRealName(realName);
		userMstr.setEmail(email);
		userMstr.setPhoneNo(phone);
		userMstr.setQqNo(qqNum);
		userMstr.setLimitPower(9);
		System.out.println("编码方式"+request.getCharacterEncoding());
		System.out.println("--------真实姓名：-------"+realName);
		try {
			if(userMstrService.registr(userMstr) != null){
				try {
					response.sendRedirect("/index.html");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else{
				System.out.println("注册失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//	更新操作
	private void update(HttpServletRequest request, HttpServletResponse response){
		
	}
}
