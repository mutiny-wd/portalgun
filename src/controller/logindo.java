package controller;

import model.dao.UserDAO;
import tools.test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "LoginController",urlPatterns = "/LoginController")
public class logindo extends HttpServlet {
    public Connection con = null;
    public PreparedStatement pst= null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        //接收客户端的请求
        String email = request.getParameter("Email");
        String password = request.getParameter("Password");


        UserDAO user = new UserDAO();
        user.doLogin(email,password);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
