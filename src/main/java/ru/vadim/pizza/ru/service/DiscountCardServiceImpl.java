package ru.vadim.pizza.ru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vadim.pizza.ru.model.DiscountCard;
import ru.vadim.pizza.ru.repository.DiscountCardRepository;

import java.util.List;

@Service
public class DiscountCardServiceImpl implements DiscountCardService {

    private DiscountCardRepository repository;

    @Autowired
    public DiscountCardServiceImpl(DiscountCardRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<DiscountCard> getAll() {
        return repository.getAll();
    }

    @Override
    public DiscountCard create(DiscountCard card) {
        return repository.create(card);
    }

    @Override
    public DiscountCard getById(String id) {
        return repository.getById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public void setExpired(String id) {
        repository.setExpired(id);
    }

    @Override
    public List<DiscountCard> filter(boolean expired) {
        return repository.filter(expired);
    }
}


