package org.first_springboot.first_spriingboot.repositories;

import org.first_springboot.first_spriingboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
