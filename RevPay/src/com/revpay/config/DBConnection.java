package com.revpay.config;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	/**
	 * @param args
	 */
    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "system",
                "system"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }


	}

