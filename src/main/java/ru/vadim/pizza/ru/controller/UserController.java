package ru.vadim.pizza.ru.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.vadim.pizza.ru.entity.User;
import ru.vadim.pizza.ru.service.interfaces.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService service;

    @Operation(summary = "Список всех пользователей")
    @GetMapping
    public List<User> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Создаёт пользователя")
    @PostMapping
    public User create(User user) {
        return service.create(user);
    }

    @Operation(summary = "Ищет пользователя по ID")
    @GetMapping("/{id}")
    public User getById(@PathVariable Long id){
        return service.getById(id);
    }

    @Operation(summary = "Удаляет пользователя по ID")
    @DeleteMapping("/{id}")
    void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }


//    @Operation(summary = "Ищет пользователя по логину")
//    @GetMapping("/{login}")
//    public User getByLogin(@PathVariable String login) {
//        return service.getByLogin(login);
//    }

//    @Operation(summary = "Удаляет пользователя")
//    @DeleteMapping("/{login}")
//    public void deleteByLogin(@PathVariable String login) {
//        service.deleteByLogin(login);
//    }
}













