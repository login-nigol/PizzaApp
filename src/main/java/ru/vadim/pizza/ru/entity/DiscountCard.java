package ru.vadim.pizza.ru.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "disc_card")
public class DiscountCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }
}
