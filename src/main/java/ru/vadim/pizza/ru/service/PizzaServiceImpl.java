package ru.vadim.pizza.ru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vadim.pizza.ru.model.Pizza;
import ru.vadim.pizza.ru.repository.PizzaRepository;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService {

    private PizzaRepository repository;

    @Autowired
    public PizzaServiceImpl(PizzaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Pizza> getAll() {
        return repository.getAll();
    }

    @Override
    public Pizza getByTitle(String title) {
        return repository.getByTitle(title);
    }
}











