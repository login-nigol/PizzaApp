package ru.vadim.pizza.ru.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.vadim.pizza.ru.model.User;
import ru.vadim.pizza.ru.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @Operation(summary = "Список всех пользователей")
    @GetMapping
    public List<User> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Создаёт пользователя")
    @PostMapping
    public User create(@RequestBody User user) {
        return service.create(user);
    }

    @Operation(summary = "Ищет пользователя по логину")
    @GetMapping("/{login}")
    public User getByLogin(@PathVariable String login) {
        return service.getByLogin(login);
    }

    @Operation(summary = "Удаляет пользователя")
    @DeleteMapping("/{login}")
    public void deleteByLogin(@PathVariable String login) {
        service.deleteByLogin(login);
    }
}













