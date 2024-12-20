package ru.vadim.pizza.ru.entity;

import jakarta.persistence.*;
import ru.vadim.pizza.ru.enums.DiscountCardType;

@Entity
@Table(name = "disc_cards")
public class DiscountCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private DiscountCardType type;

    private boolean expired;

    public DiscountCard() {
        //
    }

    public DiscountCard(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DiscountCardType getType() {
        return type;
    }

    public void setType(DiscountCardType type) {
        this.type = type;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }
}
