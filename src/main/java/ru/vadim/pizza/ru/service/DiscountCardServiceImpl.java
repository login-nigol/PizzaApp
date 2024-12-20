package ru.vadim.pizza.ru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vadim.pizza.ru.entity.DiscountCard;
import ru.vadim.pizza.ru.repository.DiscountCardJpaRepository;
import ru.vadim.pizza.ru.service.interfaces.DiscountCardService;

import java.util.List;

@Service
public class DiscountCardServiceImpl implements DiscountCardService {

    @Autowired
//    @Qualifier("dcardjdbcrepository")  // указывает какой бин репозитория нужно загрузить
    private DiscountCardJpaRepository repository;

//    пример инжекта двух бинов репозитория
//    @Qualifier("discountCardInMemoryRepository")
//    private DiscountCardRepository iMrepository;

    @Override
    public List<DiscountCard> getAll() {
        return null;
    }

    @Override
    public DiscountCard create(DiscountCard card) {
        return null;
    }

    @Override
    public DiscountCard getById(String id) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

//    @Override
//    public void setExpired(String id) {
//        repository.setExpired(id);
//    }
//
//    @Override
//    public List<DiscountCard> filter(boolean expired) {
//        return repository.filter(expired);
//    }
}



