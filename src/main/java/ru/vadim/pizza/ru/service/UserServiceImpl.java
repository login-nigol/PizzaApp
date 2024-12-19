package ru.vadim.pizza.ru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vadim.pizza.ru.model.User;
import ru.vadim.pizza.ru.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

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












