package ru.vadim.pizza.ru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.vadim.pizza.ru.service.interfaces.DiscountCardService;
import ru.vadim.pizza.ru.entity.DiscountCard;

import java.util.List;

@RestController  // @controller + @ResponseBody
@RequestMapping("/api/discountcards")
public class DiscountCardController {

    //getAll - list all cards
    //create - create new card
    //delete - delete exists card

    //1 @PathVariable - передаваемые данные как часть строки
    //2 @RequestBody  - передаваемые данные в теле запроса
    //3 @RequestParam - передаваемые данные как параметры адресной строки

    private DiscountCardService cardService;

//    @Autowired
//    private DataBaseManager dbManager; // Optional

    @Autowired
    public DiscountCardController(DiscountCardService cardService) {
        this.cardService = cardService;
    }

    // http://localhost:8080/api/discountcards
    @GetMapping // DispatcherServlet - в этот метод передаст GET запрос по адресу контроллера
    public List<DiscountCard> getAll() {
//        dbManager.getConnection(); // Optional
        return cardService.getAll();
    }

    // @RequestBody -- параметр из тела запроса
    @PostMapping
    public DiscountCard create(@RequestBody DiscountCard card) {
        return cardService.create(card);
    }

    // @PathVariable -- взятие параметра из адресной строки
    // Параметры адресной строки доступны всем! Небезопасно!
    @GetMapping("/{id}")
    public DiscountCard getById(@PathVariable String id) {
        return cardService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable(name = "id") String id) {
        cardService.deleteById(id);
    }

//    @PostMapping("/expired/{id}")
//    public void setExpired(@PathVariable String id) {
//        cardService.setExpired(id);
//    }
//
//    // http://localhost:8080/api/discountcards/filter?expired=false
//    @GetMapping("/filter")
//    public List<DiscountCard> getAllByState(@RequestParam(name = "expired") boolean expired) {
//        return cardService.filter(expired);
//    }
}








