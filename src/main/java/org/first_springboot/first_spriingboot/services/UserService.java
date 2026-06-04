package org.first_springboot.first_spriingboot.services;

import org.first_springboot.first_spriingboot.entities.User;
import org.first_springboot.first_spriingboot.repositories.UserRepository;
import org.first_springboot.first_spriingboot.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(()->new ResourceNotFoundException(id));
    }

    public User insert(User obj){
         return userRepository.save(obj);
    }

    public void delete(Long id){
        if (!userRepository.existsById(id)) {
            throw new ResourceNotFoundException(id);
        }

        try {
            userRepository.deleteById(id);
        } catch (org.springframework.dao.DataIntegrityViolationException e) {
            throw new org.first_springboot.first_spriingboot.services.exceptions.ResourceNotFoundException(e.getMessage());
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public User update( Long id, User obj){
        User entity = userRepository.getReferenceById(id);
        updateData(entity,obj);
        return userRepository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }

}
