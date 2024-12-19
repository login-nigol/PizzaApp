package ru.vadim.pizza.ru.service;

import ru.vadim.pizza.ru.model.Pizza;

import java.util.List;

public interface PizzaService {

    List<Pizza> getAll();

    Pizza getByTitle(String title);
}
