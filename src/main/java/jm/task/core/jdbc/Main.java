package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        UserServiceImpl userServiceImpl=new UserServiceImpl();

        userServiceImpl.createUsersTable();
        userServiceImpl.saveUser("Valli", "Kotikov", (byte) 45);
        userServiceImpl.saveUser("Irina", "Shemeleva", (byte) 25);
        userServiceImpl.saveUser("Maxim", "Penza", (byte) 543);
        userServiceImpl.saveUser("Kod", "Jonson", (byte) 34);
        System.out.println(userServiceImpl.getAllUsers());
        userServiceImpl.cleanUsersTable();
        userServiceImpl.dropUsersTable();

    }
}
