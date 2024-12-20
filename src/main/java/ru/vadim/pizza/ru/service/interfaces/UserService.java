package ru.vadim.pizza.ru.service.interfaces;

import ru.vadim.pizza.ru.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getById(Long id);

    User create(User user);

    void deleteById(Long id);
}
