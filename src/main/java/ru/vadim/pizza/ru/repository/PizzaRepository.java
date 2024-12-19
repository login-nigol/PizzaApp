package ru.vadim.pizza.ru.repository;

import ru.vadim.pizza.ru.model.Pizza;

import java.util.List;

public interface PizzaRepository {

    List<Pizza> getAll();

    Pizza getByTitle(String pizza);
}
