package com.bhh.scrud.services;

import com.bhh.scrud.entities.Products;
import com.bhh.scrud.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired private ProductRepository repository;

    public List<Products> getAll(){
        return repository.findAll();
    }

}
