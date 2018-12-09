package controller;

import model.dao.UserDAO;
import model.vo.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterController",urlPatterns = "/RegisterController")
public class registerdo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
        　* @Description: TODO Servlet 注册验证
        　* @param [request, response]
        　* @return void
        　* @author Mutiny
        　* @date 2018/12/4 14:49
        　*/
        request.setCharacterEncoding("UTF-8");
        //接收客户端的请求
        String email = request.getParameter("Email");
        String name = request.getParameter("Name");
        UserDAO user=new UserDAO();
        boolean flag=true;
        flag=user.doFindEmail(email)||user.doFindName(email);
        if(flag==false)//数据库没有新用户信息
        {
            String password = request.getParameter("Password");
            String number = request.getParameter("Number");
            String sex = request.getParameter("optionsRadios");
            boolean SEX =false;
            if("girl".equals(sex))
                SEX=true;
            User newuser = new User(name,email,password,number,SEX);
            if(user.addUser(newuser))
            {
                request.setAttribute("error","注册成功");
                RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");
                rd.forward(request,response);
                response.sendRedirect("/login.jsp");
            }
        }
        else
        {
            request.setAttribute("error","已存在用户名或邮箱");
            RequestDispatcher rd=request.getRequestDispatcher("/register.jsp");
            rd.forward(request,response);
            response.sendRedirect("/register.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
