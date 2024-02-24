package com.bhh.scrud.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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

    @NotBlank(message = "Name must have at least 3 characters.")
    private String name;

    @Column(nullable = false, columnDefinition = "boolean default true")
    private boolean isActive;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
