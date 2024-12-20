package ru.vadim.pizza.ru.service.old;

import org.springframework.beans.factory.annotation.Autowired;
import ru.vadim.pizza.ru.entity.User;
import ru.vadim.pizza.ru.repository.old.UserRepository;

import java.util.List;

@Deprecated
//@Service
public class UserServiceJDBCImpl implements UserServiceJDBC {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> getAll() {
        return repository.getAll();
    }

    @Override
    public User create(User user) {
        return repository.create(user);
    }

    @Override
    public User getByLogin(String login) {
        return repository.getByLogin(login);
    }

    @Override
    public void deleteByLogin(String login) {
        repository.deleteByLogin(login);
    }
}












