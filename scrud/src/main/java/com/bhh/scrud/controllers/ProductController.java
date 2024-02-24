package com.bhh.scrud.controllers;

import com.bhh.scrud.entities.Products;
import com.bhh.scrud.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired private ProductService service;

    @GetMapping
    public ResponseEntity<List<Products>> getAll(){
        List<Products> products = this.service.getAll();
        return ResponseEntity.ok().body(products);
    }
}
