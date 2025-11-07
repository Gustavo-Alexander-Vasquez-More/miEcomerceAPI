package com.shop.miecomerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 150, nullable = false)
    private String description;
    @Column(nullable = false)
    private double price;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PhotoEntity> photos;
    @Column(nullable = false)
    private int stock;
    @Column(length =10, nullable = false)
    private String sku;
    @Column(nullable = false)
    private boolean isActive=true;
    @Column(nullable = false)
    private Date createdAt;
    @Column(nullable = false)
    private Date updatedAt;

    @PrePersist // Se ejecuta antes de la primera inserción
    protected void onCreate() {
        createdAt = new Date();
        updatedAt = new Date(); // Es igual al created_at al inicio
    }
    @PreUpdate // Se ejecuta antes de cualquier actualización
    protected void onUpdate() {
        updatedAt = new Date();
    }
}
