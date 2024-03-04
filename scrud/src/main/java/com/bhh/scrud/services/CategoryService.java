package com.bhh.scrud.services;

import com.bhh.scrud.dtos.CategoryDTO;
import com.bhh.scrud.dtos.ProductsDTO;
import com.bhh.scrud.entities.Category;
import com.bhh.scrud.entities.Products;
import com.bhh.scrud.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired private CategoryRepository repository;

    public List<Category> getAll() { return repository.findAll(); }

    public Optional<Category> findById(Long id) {return repository.findById(id);}

    @Transactional
    public CategoryDTO update(Long id, CategoryDTO dto) {
        Category entity = repository.getReferenceById(id);
        copyDtoToEntity(dto, entity);
        entity = repository.save(entity);
        return new CategoryDTO(entity);
    }

    @Transactional
    public CategoryDTO insert(CategoryDTO dto) {
        Category entity = new Category();
        copyDtoToEntity(dto, entity);
        entity = repository.save(entity);
        return new CategoryDTO(entity);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    private void copyDtoToEntity(CategoryDTO dto, Category entity) {
        entity.setName(dto.getName());
    }
}
