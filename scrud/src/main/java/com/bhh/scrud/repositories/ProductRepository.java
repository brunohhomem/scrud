package com.bhh.scrud.repositories;

import com.bhh.scrud.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {
}
