package ru.vadim.pizza.ru.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import ru.vadim.pizza.ru.enums.PizzaType;
import ru.vadim.pizza.ru.model.Pizza;

import java.util.*;

@Component
//@Primary
public class PizzaInMemoryRepository implements PizzaRepository {

    private List<Pizza> storage = Arrays.asList(
            new Pizza("Four Cheese", PizzaType.SMALL),
            new Pizza("Margherita", PizzaType.MEDIUM),
            new Pizza("Pepperoni", PizzaType.LARGE)
    );

    @Override
    public List<Pizza> getAll() {
        return storage;
    }

    @Override
    public Pizza getByTitle(String pizza) {
        return null;
    }
}

