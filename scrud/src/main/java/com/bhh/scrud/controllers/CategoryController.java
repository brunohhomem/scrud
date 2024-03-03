package com.bhh.scrud.controllers;

import com.bhh.scrud.entities.Category;
import com.bhh.scrud.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> getAll(){
        List<Category> categories = this.service.getAll();
        return ResponseEntity.ok().body(categories);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Category>> findById(@PathVariable Long id){
        Optional<Category> category = service.findById(id);
        return ResponseEntity.ok().body(category);
    }
}
