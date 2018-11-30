package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static final String DBDRIVER="com.mysql.jdbc.Driver";
    public static final String DBURL="jdbc:mysql://localhost:3306/?useUnicode=true&characterEncoding=utf-8";
    public static final String DBUSER="root";
    public static final String DBPASSWORD="wD980304";
    private Connection conn=null;

    public DBConnection()
    {
        //加载驱动
        try {
            Class.forName(DBDRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //建立连接
        try {
            conn= DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //获取连接对象
    public Connection getConnection()
    {
        return this.conn;
    }

    //关闭连接对象
    public void close()
    {
        if(this.conn!=null) {
            try {
                this.conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
