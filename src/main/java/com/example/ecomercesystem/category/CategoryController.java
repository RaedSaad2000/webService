package com.example.ecomercesystem.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping(value = "/{id}")
    public Category findById(@PathVariable int id){
        return categoryService.getItem(id);
    }
    @GetMapping(value = "/")
    public List<Category> find(){
        return categoryService.getAllItems();
    }
    @PostMapping(value = "/")
    public void add(@RequestBody Category category){
        System.out.println(category

        );
        categoryService.addItem(category);
    }
}
