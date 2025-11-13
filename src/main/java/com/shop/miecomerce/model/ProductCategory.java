package com.shop.miecomerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name ="product_categories")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Category category;
    private LocalDateTime createDate;

    @PrePersist
    protected void onCreate() {
        this.createDate = LocalDateTime.now();
    }
}
