package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String DBURL="jdbc:mysql://localhost:3306/portalgun?useUnicode=true&characterEncoding=utf-8";
    private static final String DBUSER="root";
    private static final String DBPASSWORD="wD980304";
    private static final String DRIVER="com.mysql.jdbc.Driver";
    private static Connection con ;

    //加载驱动，建立连接
    public DBConnection(){
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC驱动错误");
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
        } catch (SQLException e) {
            System.out.println("JDBC连接字符串错误");
            e.printStackTrace();
        }
    }

    //获取连接
    public static Connection getConnection()
    {
        return con;
    }

    //关闭连接
    public static void disConnection()
    {
        if(con!=null)
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("关闭连接错误");
                e.printStackTrace();
            }
    }

}

