package com.example.ecomercesystem.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category getItem(int id){
        return categoryRepository.findById(id).get();
    }
    public List<Category> getAllItems(){
        return categoryRepository.findAll();
    }
    public void addItem(Category category){
        categoryRepository.save(category);
    }
}
