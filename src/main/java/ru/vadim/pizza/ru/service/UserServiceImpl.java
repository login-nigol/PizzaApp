package ru.vadim.pizza.ru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vadim.pizza.ru.entity.User;
import ru.vadim.pizza.ru.exeption.UserNotFoundException;
import ru.vadim.pizza.ru.service.interfaces.UserService;
import ru.vadim.pizza.ru.repository.UserJpaRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserJpaRepository repository;

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    public User getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User with id " + id + " not found"));
    }

    @Override
    public User getByName(String name) {
        return repository.findByLogin(name);
    }

    @Override
    public List<User> getWithEqualsPassword(String password) {
        return repository.findAllByPassword(password);
    }

    @Override
    public List<User> getUserWithUserInfo(String info) {
        return repository.getUserWithUserInfo(info);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}









