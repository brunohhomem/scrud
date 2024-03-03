package com.bhh.scrud.dtos;

import com.bhh.scrud.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {

    private Long id;
    private String name;
    public CategoryDTO(Category entity) { //construtor com entidade
        id = entity.getId();
        name = entity.getName();
    }
}
