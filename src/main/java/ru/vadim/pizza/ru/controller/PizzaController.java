package ru.vadim.pizza.ru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.vadim.pizza.ru.service.PizzaService;
import ru.vadim.pizza.ru.model.Pizza;

import java.util.List;

@RestController
@RequestMapping("/api/pizzas")
public class PizzaController {

    private PizzaService service;

    @Autowired
    public PizzaController(PizzaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pizza> getAll() {
        return service.getAll();
    }

    @GetMapping("/{title}")
    public Pizza getByTitle(@PathVariable String title) {
        return service.getByTitle(title);
    }
}
















