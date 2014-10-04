package myWork.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 09.09.2014
 * Time:  16:30
 * To change this template use File|Setting|File Templates.
 */
public class JDBConnection {

    public Connection getConnection(){
        Connection conn = null;
        Locale.setDefault(Locale.ENGLISH);
        System.out.println("Application started...");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e)  {
            System.out.println("Driver not found");
            e.printStackTrace();
            return null;
        }
        System.out.println("JDBC driver is loaded!");


        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        try {
            conn = DriverManager.getConnection(url, "hr", "hr");
            System.out.println("Connection is compleate!");
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }

        return conn;
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        System.out.println("Application started...");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
    } catch (ClassNotFoundException e)  {
        System.out.println("Driver not found");
        e.printStackTrace();
        return;
    }
    System.out.println("JDBC driver is loaded!");

    Connection conn = null;
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        try {
            conn = DriverManager.getConnection(url, "hr", "hr");
            System.out.println("Connection is compleate!");
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        } finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}
