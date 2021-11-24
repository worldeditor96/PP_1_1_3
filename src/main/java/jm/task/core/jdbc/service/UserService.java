package jm.task.core.jdbc.service;

import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    void createUsersTable() throws SQLException;

    void dropUsersTable() throws SQLException;

    void saveUser(String name, String lastName, byte age) throws SQLException;

    void removeUserById(long id) throws SQLException;

    List<User> getAllUsers() throws SQLException;

    void cleanUsersTable() throws SQLException;
}

/*
 +Создание таблицы для User(ов) – не должно приводить к исключению, если такая таблица уже существует
 +Удаление таблицы User(ов) – не должно приводить к исключению, если таблицы не существует
 +Очистка содержания таблицы
 +Добавление User в таблицу
 +Удаление User из таблицы ( по id )
 +Получение всех User(ов) из таблицы
 */