package com.bhh.scrud.services;

import com.bhh.scrud.entities.Products;
import com.bhh.scrud.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    @Autowired private ProductsRepository repository;

    public List<Products> getAll(){
        return repository.findAll();
    }

    public java.util.Optional<Products> findById(Long id){
        return repository.findById(id);
    }

}
