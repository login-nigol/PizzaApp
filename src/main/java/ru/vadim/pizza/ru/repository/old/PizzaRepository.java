package ru.vadim.pizza.ru.repository.old;

import ru.vadim.pizza.ru.entity.Pizza;

import java.util.List;

@Deprecated
public interface PizzaRepository {

    List<Pizza> getAll();

    Pizza getByTitle(String pizza);
}
