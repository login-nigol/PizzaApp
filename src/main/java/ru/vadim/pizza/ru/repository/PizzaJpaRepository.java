package ru.vadim.pizza.ru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vadim.pizza.ru.entity.Pizza;

@Repository
public interface PizzaJpaRepository extends JpaRepository<Pizza, Long> {
}
