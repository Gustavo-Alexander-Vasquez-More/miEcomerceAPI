package com.shop.miecomerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "photos_product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhotoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product", nullable = false)
    private ProductEntity product;
    @Column(nullable = false)
    private String url;
    @Column(nullable = false)
    private boolean isPrincipal;
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
