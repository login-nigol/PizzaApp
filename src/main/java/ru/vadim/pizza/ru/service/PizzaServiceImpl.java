package ru.vadim.pizza.ru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vadim.pizza.ru.entity.Pizza;
import ru.vadim.pizza.ru.service.interfaces.PizzaService;
import ru.vadim.pizza.ru.repository.PizzaJpaRepository;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaJpaRepository repository;

    @Override
    public List<Pizza> getAll() {
        return repository.findAll();
    }

    @Override
    public Pizza getByTitle(String title) {
        return null;
    }
}











