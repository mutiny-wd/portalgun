package model.dao;

import model.vo.User;
import tools.DBConnection;

import java.sql.*;

public class UserDAO {

    public  Connection conn;
    public PreparedStatement pst = null;
    public boolean doLogin(String email,String password) {
        /**
        　* @Description: TODO 登录时验证邮箱密码
        　* @param [email, password]
        　* @return boolean
        　* @author Mutiny
        　* @date 2018/12/4 13:57
        　*/
        DBConnection dbc=new DBConnection();
        conn=dbc.getConnection();
        String DBpassword=null;//数据库中对应邮箱密码
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
            if(rs.next())// TODO: 2018/12/4 待完善 错误分类
                DBpassword = rs.getString("user_password");
            else
            {
                return false;//邮箱未找到
            }
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

        if(DBpassword.equals(password))//判断密码是否相等
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public boolean doFindEmail(String email)
    {
        DBConnection dbc=new DBConnection();
        conn=dbc.getConnection();
        String DBpassword=null;//数据库中对应邮箱密码
        String sql="select 1 from user where user_email=? limit 1";
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
            rs=pst.executeQuery();// TODO: 2018/12/4 待解决 查询
        } catch (SQLException e) {
            System.out.println("执行错误");
            e.printStackTrace();
        }
        return true;
    }
    public String getName(String email)
    {
        String name=null;
        DBConnection dbc=new DBConnection();
        conn=dbc.getConnection();
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
            rs=pst.executeQuery();//
        } catch (SQLException e) {
            System.out.println("执行错误");
            e.printStackTrace();
        }

        try {
            if(rs.next())
            {
                name = rs.getString("user_name");
            }
            else
            {
                return null;//名字未找到
            }
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

        return name;
    }
    public boolean doFindName(String email)
    {
        DBConnection dbc=new DBConnection();
        conn=dbc.getConnection();
        String sql="select 1 from user where user_email=? limit 1";
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
            rs=pst.executeQuery();// TODO: 2018/12/4 待解决 查询
        } catch (SQLException e) {
            System.out.println("执行错误");
            e.printStackTrace();
        }
        try {
            if(rs.next())
                return true;
            else
                return false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean addUser(User user)
    {
        /**
        　* @Description: TODO
        　* @param [user]
        　* @return boolean
        　* @author Mutiny
        　* @date 2018/12/9 10:13
        　*/

        DBConnection dbc=new DBConnection();
        conn=dbc.getConnection();
        String sql="insert into user values(?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.setString(1,user.UserName);
            pst.setString(2,user.UserEmail);
            pst.setString(3,user.UserPassWord);
            pst.setInt(4,Integer.parseInt(user.UserNumber));
            pst.setBoolean(5,user.UserSex);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int res=0;
        try {
            res=pst.executeUpdate();
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
        if(res>0)
        {
            return true;
        }
        return false;
    }
}
