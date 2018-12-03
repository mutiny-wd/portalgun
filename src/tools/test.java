package tools;

import tools.DBConnection;

import java.sql.*;

public class test {
    Connection con;
    public test()
    {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");//加载驱动
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        String url="jdbc:mysql://127.0.0.1:3306/portalgun?useUnicode=true&characterEncoding=utf8";
//        try {
//            Connection con= DriverManager.getConnection(url,"root","wD980304");//连接字符串
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }
    public void checkLogin(String userName, String password) throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");//加载驱动
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url="jdbc:mysql://127.0.0.1:3306/portalgun?useUnicode=true&characterEncoding=utf8";
        try {
            Connection con= DriverManager.getConnection(url,"root","wD980304");//连接字符串
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql="select * from user where user_email=?";
        PreparedStatement pst=con.prepareStatement(sql);//
        pst.setString(1,userName);//添加参数
        ResultSet rs=pst.executeQuery();//用于SELECT语句
        //pst.execute();//用于非SELECT语句

        pst.close();
        con.close();

    }
}
