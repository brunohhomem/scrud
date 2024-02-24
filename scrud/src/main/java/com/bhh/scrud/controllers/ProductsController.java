package com.bhh.scrud.controllers;

import com.bhh.scrud.entities.Products;
import com.bhh.scrud.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired private ProductsService service;

    @GetMapping
    public ResponseEntity<List<Products>> getAll(){
        List<Products> products = this.service.getAll();
        return ResponseEntity.ok().body(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Products>> findById(@PathVariable Long id){
        Optional<Products> product = service.findById(id);
        return ResponseEntity.ok().body(product);
    }
}
