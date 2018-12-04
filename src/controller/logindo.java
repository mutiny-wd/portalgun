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
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
        }
        else//登录失败
        {
            response.sendRedirect("login.jsp?error=yes");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
