package ru.vadim.pizza.ru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vadim.pizza.ru.entity.User;

import java.util.List;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Long> {

    List<User> findAllById(Long id);
}
