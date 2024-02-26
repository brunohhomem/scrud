package com.bhh.scrud.controllers;

import com.bhh.scrud.dtos.ProductsDTO;
import com.bhh.scrud.entities.Products;
import com.bhh.scrud.services.ProductsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/{id}")
    public ResponseEntity<ProductsDTO> update(@PathVariable Long id, @RequestBody @Valid ProductsDTO dto){
        dto = service.update(id, dto);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<ProductsDTO> insert(@RequestBody @Valid ProductsDTO dto){
        dto = service.insert(dto);
        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductsDTO> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
