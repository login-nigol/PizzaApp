package ru.vadim.pizza.ru.repository.old;

import ru.vadim.pizza.ru.entity.User;

import java.util.List;

@Deprecated
public interface UserRepository {

    List<User> getAll();

    User create(User user);

    User getByLogin(String login);

    void deleteByLogin(String login);
}
