package org.first_springboot.first_spriingboot.repositories;

import org.first_springboot.first_spriingboot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
