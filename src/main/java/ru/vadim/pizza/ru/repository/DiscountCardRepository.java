package ru.vadim.pizza.ru.repository;

import ru.vadim.pizza.ru.model.DiscountCard;

import java.util.List;

public interface DiscountCardRepository {

    List<DiscountCard> getAll();

    DiscountCard create(DiscountCard card);

    DiscountCard getById(String id);

    void deleteById(String id);

    void setExpired(String id);

    List<DiscountCard> filter(boolean expired);
}
