package controller;

import model.dao.UserDAO;
import tools.test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "LoginController",urlPatterns = "/LoginController")
public class logindo extends HttpServlet {
    public Connection con = null;
    public PreparedStatement pst= null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
        　* @Description: TODO Servlet 登录验证
        　* @param [request, response]
        　* @return void
        　* @author Mutiny
        　* @date 2018/12/4 14:20
        　*/
        request.setCharacterEncoding("UTF-8");
        //接收客户端的请求
        String email = request.getParameter("Email");
        String password = request.getParameter("Password");
        boolean flag=false;
        UserDAO user = new UserDAO();
        flag = user.doLogin(email,password);
        if (flag)//登录成功
        {

            HttpSession session=request.getSession();
            session.setAttribute("success","y");
            request.setAttribute("currentUser",user.getName(email));
            RequestDispatcher rd=request.getRequestDispatcher("/main.jsp");
            rd.forward(request,response);
            response.sendRedirect("/main.jsp");
        }
        else//登录失败
        {
            request.setAttribute("error","账号密码错误");
            RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");
            rd.forward(request,response);
            response.sendRedirect("/login.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
