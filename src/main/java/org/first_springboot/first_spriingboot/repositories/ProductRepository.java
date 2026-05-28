package org.first_springboot.first_spriingboot.repositories;

import org.first_springboot.first_spriingboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
