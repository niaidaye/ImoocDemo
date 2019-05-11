 package com.imooc.servlet;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.imooc.domain.User;

/**
 * 用户注册初始化的servlet
 */
public class InitServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// 创建一个集合，用于保存用户注册的信息
		List<User> list = new ArrayList<User>();
		
		// 讲list集合保存在servletContext作用域中
		this.getServletContext().setAttribute("list", list);
		
	}
	
}
