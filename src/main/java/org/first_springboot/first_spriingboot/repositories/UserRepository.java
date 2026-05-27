package org.first_springboot.first_spriingboot.repositories;

import org.first_springboot.first_spriingboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
