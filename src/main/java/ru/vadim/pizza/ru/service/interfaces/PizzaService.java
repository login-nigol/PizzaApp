package ru.vadim.pizza.ru.service.interfaces;

import ru.vadim.pizza.ru.entity.Pizza;

import java.util.List;

public interface PizzaService {

    List<Pizza> getAll();

    Pizza getByTitle(String title);
}
