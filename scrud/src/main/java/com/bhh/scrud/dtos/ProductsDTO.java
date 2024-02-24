package com.bhh.scrud.dtos;

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
    private String name;
    private boolean isActive;
    private LocalDateTime createdAt;
}
