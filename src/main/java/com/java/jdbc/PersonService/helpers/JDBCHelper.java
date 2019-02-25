package com.java.jdbc.PersonService.helpers;

import java.sql.*;

public class JDBCHelper {
    private static Connection connection;
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
       System.out.println("Registering driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
        {
            try {
                connection=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","JavaUser","admin");

            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }
    public static void closeConnection(Connection con) throws SQLException
    {
        if (con!=null)
        {
            con.close();
        }
    }
    public static void closeStatement(Statement stmt) throws SQLException
    {
        if (stmt!=null)
        {
            stmt.close();
        }
    }
    public static void closeResultSet(ResultSet rs) throws SQLException
    {
        if (rs!=null)
        {
            rs.close();
        }
    }
}

