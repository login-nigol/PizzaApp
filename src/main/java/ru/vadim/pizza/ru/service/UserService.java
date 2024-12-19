package ru.vadim.pizza.ru.service;

import ru.vadim.pizza.ru.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User create(User user);

    User getByLogin(String login);

    void deleteByLogin(String login);
}
