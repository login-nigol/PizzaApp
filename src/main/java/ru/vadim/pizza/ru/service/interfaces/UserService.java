package ru.vadim.pizza.ru.service.interfaces;

import ru.vadim.pizza.ru.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User create(User user);

    User getById(Long id);

    User getByName(String name);

    List<User> getWithEqualsPassword(String password);

    List<User> getUserWithUserInfo(String usersWithInfo);

    void delete(Long id);
}
