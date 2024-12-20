package ru.vadim.pizza.ru.repository.old;

import ru.vadim.pizza.ru.enums.PizzaType;
import ru.vadim.pizza.ru.entity.Pizza;

import java.util.*;

@Deprecated
//@Component
//@Primary
public class PizzaInMemoryRepository implements PizzaRepository {

//    private List<Pizza> storage = Arrays.asList(
//            new Pizza("Four Cheese", PizzaType.SMALL),
//            new Pizza("Margherita", PizzaType.MEDIUM),
//            new Pizza("Pepperoni", PizzaType.LARGE)
//    );

    @Override
    public List<Pizza> getAll() {
        return null;
    }

    @Override
    public Pizza getByTitle(String pizza) {
        return null;
    }
}

