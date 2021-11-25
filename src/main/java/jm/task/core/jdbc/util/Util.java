package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String username="Max";
    private static final String password="1111";
    private static final String conectionURL="jdbc:mysql://localhost:3306/schema_1_1_3";


    public static Connection getConnection () {

        Connection connection=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(conectionURL, username, password);
            if (!connection.isClosed()) {
                System.out.println("Connection is ready");
            }

            //Statement statement= connection.createStatement();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Connection error");
            e.printStackTrace();
        }
        return connection;
    }
}
