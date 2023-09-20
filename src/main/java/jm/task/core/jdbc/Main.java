package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.List;

public class Main {

    /*private final static String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "Hohner03";*/
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        /*UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("AA", "aa", (byte) 22);
        userDaoJDBC.saveUser("BB", "bb", (byte) 22);
        userDaoJDBC.saveUser("CC", "cc", (byte) 22);
        userDaoJDBC.saveUser("DD", "dd", (byte) 22);
        userDaoJDBC.saveUser("EE", "ee", (byte) 22);
        userDaoJDBC.removeUserById(2);
        List<User> users = userDaoJDBC.getAllUsers();
        System.out.println(users);

        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.saveUser("BB", "bb", (byte) 22);
        userDaoJDBC.saveUser("CC", "cc", (byte) 22);
        users = userDaoJDBC.getAllUsers();
        System.out.println(users);
        new Util();*/

        Util.getSessionFactory();
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Marina", "Orange", (byte) 26);
        userService.saveUser("Tolyan", "Blue", (byte) 30);
        userService.saveUser("Kolyan", "Green", (byte) 29);
        userService.saveUser("Tao", "Bao", (byte) 50);
        userService.removeUserById(4);

        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.saveUser("Kolyan", "Green", (byte) 29);
        userService.saveUser("Tao", "Bao", (byte) 50);

        userService.getAllUsers();
        userService.dropUsersTable();

    }
}
