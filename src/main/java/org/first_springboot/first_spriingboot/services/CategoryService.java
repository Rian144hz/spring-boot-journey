package org.first_springboot.first_spriingboot.services;

import org.first_springboot.first_spriingboot.entities.Category;
import org.first_springboot.first_spriingboot.entities.Order;
import org.first_springboot.first_spriingboot.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
     public Category findById(Long id){
         Optional<Category> obj = categoryRepository.findById(id);
         return obj.get();
     }
}
