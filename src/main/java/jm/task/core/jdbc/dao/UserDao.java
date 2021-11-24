package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.util.List;

public interface UserDao {
    // Создание таблицы для User(ов) – не должно приводить к исключению, если такая таблица уже существует
    void createUsersTable();

    //Удаление таблицы User(ов) – не должно приводить к исключению, если таблицы не существует
    void dropUsersTable();

    //Добавление User в таблицу
    void saveUser(String name, String lastName, byte age);

    //Удаление User из таблицы ( по id )
    void removeUserById(long id);

    //Получение всех User(ов) из таблицы
    List<User> getAllUsers();

    //Очистка содержания таблицы
    void cleanUsersTable();
}

/*
 +Создание таблицы для User(ов) – не должно приводить к исключению, если такая таблица уже существует
 +Удаление таблицы User(ов) – не должно приводить к исключению, если таблицы не существует
 +Очистка содержания таблицы
 +Добавление User в таблицу
 +Удаление User из таблицы ( по id )
 +Получение всех User(ов) из таблицы
 */