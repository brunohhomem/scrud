package com.bhh.scrud.services;

import com.bhh.scrud.dtos.ProductsDTO;
import com.bhh.scrud.entities.Products;
import com.bhh.scrud.repositories.ProductsRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {
    @Autowired private ProductsRepository repository;

    public List<Products> getAll(){
        return repository.findAll();
    }

    public Optional<Products> findById(Long id){
        return repository.findById(id);
    }

    @Transactional
    public ProductsDTO update(Long id, ProductsDTO dto) {
        Products entity = repository.getReferenceById(id);
        copyDtoToEntity(dto, entity);
        entity = repository.save(entity);
        return new ProductsDTO(entity);
    }

    @Transactional
    public ProductsDTO insert(ProductsDTO dto) {
        Products entity = new Products();
        copyDtoToEntity(dto, entity);
        entity = repository.save(entity);
        return new ProductsDTO(entity);
    }

    private void copyDtoToEntity(ProductsDTO dto, Products entity) {
        entity.setName(dto.getName());
        entity.setIsActive(dto.getIsActive());
    }
}
