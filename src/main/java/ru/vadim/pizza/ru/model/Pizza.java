package ru.vadim.pizza.ru.model;

import ru.vadim.pizza.ru.enums.PizzaType;


public class Pizza {

    private String title;

    private PizzaType type;

    public Pizza() {
        //
    }

    public Pizza(String title, PizzaType type) {
        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PizzaType getType() {
        return type;
    }

    public void setType(PizzaType type) {
        this.type = type;
    }
}
