package com.bhh.scrud.dtos;

import com.bhh.scrud.entities.Products;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductsDTO {

    private Long id;
    private String name;
    private Boolean isActive;
    private LocalDateTime createdAt;

    public ProductsDTO(Products entity) { //construtor com entidade
        id = entity.getId();
        name = entity.getName();
        isActive = entity.getIsActive();
    }
}
