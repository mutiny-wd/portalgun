package model.dao;

import tools.DBConnection;

import java.sql.*;

public class UserDAO {

    public  Connection conn;
    public PreparedStatement pst = null;
    public boolean doLogin(String email,String password) {

        DBConnection dbc=new DBConnection();
        conn=dbc.getConnection();
        String DBpassword=null;
        String sql="select * from user where user_email=?";

        try {
            pst = conn.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println("预处理错误");
            e.printStackTrace();
        }


        try {
            pst.setString(1,email);
        } catch (SQLException e) {
            System.out.println("setString()错误");
            e.printStackTrace();
        }

        ResultSet rs=null;
        try {
            rs=pst.executeQuery();
        } catch (SQLException e) {
            System.out.println("执行错误");
            e.printStackTrace();
        }

        try {
            rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            DBpassword=rs.getString("user_password");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(DBpassword.equals(password))
        {
            System.out.println("登录成功");
        }
        else
        {
            System.out.println("登录失败");
        }
        return true;
    }
}
