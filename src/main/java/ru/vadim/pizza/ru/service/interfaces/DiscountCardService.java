package ru.vadim.pizza.ru.service.interfaces;

import ru.vadim.pizza.ru.entity.DiscountCard;

import java.util.List;

public interface DiscountCardService {

    List<DiscountCard> getAll();

    DiscountCard create(DiscountCard card);

    DiscountCard getById(String id);

    void deleteById(String id);

//    void setExpired(String id);
//
//    List<DiscountCard> filter(boolean expired);
}
