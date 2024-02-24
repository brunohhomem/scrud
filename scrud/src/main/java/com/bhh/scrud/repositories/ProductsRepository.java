package com.bhh.scrud.repositories;

import com.bhh.scrud.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}
