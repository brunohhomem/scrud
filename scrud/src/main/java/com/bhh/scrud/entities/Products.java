package com.bhh.scrud.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, max = 60, message = "Nome deve ter entre 3 e 60 caracteres.")
    @NotBlank(message = "Campo requerido.")
    private String name;

    @Column(nullable = false, columnDefinition = "boolean default true")
    private Boolean isActive;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
