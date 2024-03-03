package com.bhh.scrud.services;

import com.bhh.scrud.entities.Category;
import com.bhh.scrud.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired private CategoryRepository repository;

    public List<Category> getAll() { return repository.findAll(); }

    public Optional<Category> findById(Long id) {return repository.findById(id);}
}
