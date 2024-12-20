package ru.vadim.pizza.ru.entity;

import jakarta.persistence.*;
import ru.vadim.pizza.ru.enums.PizzaType;

@Entity
@Table(name = "pizzas")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private PizzaType type;

    public Pizza() {
        //
    }
}
