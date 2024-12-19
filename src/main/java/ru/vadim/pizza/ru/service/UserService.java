package ru.vadim.pizza.ru.service;

import ru.vadim.pizza.ru.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User create(User user);

    User getById(Long id);

    void deleteById(Long id);
}
