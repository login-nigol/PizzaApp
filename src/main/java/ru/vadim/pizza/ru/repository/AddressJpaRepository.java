package ru.vadim.pizza.ru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import ru.vadim.pizza.ru.entity.Address;

@Repository
public interface AddressJpaRepository extends JpaRepository<Address, Long> {
}
