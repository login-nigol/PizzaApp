package ru.vadim.pizza.ru.repository.old;

import ru.vadim.pizza.ru.entity.DiscountCard;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Deprecated
//@Component
public class DiscountCardInMemoryRepository implements DiscountCardRepository {

    //                                local db
    private Map<String, DiscountCard> storage = new HashMap<>();

    public DiscountCardInMemoryRepository() {
        init();
    }

    private void init() {
//        DiscountCard card1 = new DiscountCard("card1");
//        DiscountCard card2 = new DiscountCard("card2");
//        DiscountCard card3 = new DiscountCard("card3");
//        storage.put(card1.getId(), card1);
//        storage.put(card2.getId(), card2);
//        storage.put(card3.getId(), card3);
    }

//    @Override
    public List<DiscountCard> getAll() {
        return storage.values().stream().toList();
    }

//    @Override
    public DiscountCard create(DiscountCard card) {
        DiscountCard discountCard = new DiscountCard(card.getId());
//        storage.put(card.getId(), discountCard);
        return null;
    }

//    @Override
    public DiscountCard getById(String id)  {
        return storage.get(id);
    }

    @Override
    public void deleteById(String id) {
        storage.remove(id);
    }

    @Override
    public void setExpired(String id) {
        DiscountCard discountCard = storage.get(id);
        discountCard.setExpired(true);
    }

    @Override
    public List<DiscountCard> filter(boolean expired) {
        return storage.values().stream()
                .filter(discountCard -> discountCard.isExpired() == expired)
                .collect(Collectors.toList());
    }
}














