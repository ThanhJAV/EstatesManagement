package com.estates.controller.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estates.model.UserModel;

@WebServlet(urlPatterns = { "/trang-chu" })
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = -5239860100362727031L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserModel userModel = new UserModel();
		userModel.setFullName("Hello Word");
		request.setAttribute("model", userModel);
		RequestDispatcher rd = request.getRequestDispatcher("views/web/home.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
