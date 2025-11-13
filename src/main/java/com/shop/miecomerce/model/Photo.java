package com.shop.miecomerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "photos_product")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Product product;
    @Column(nullable = false)
    private String url;
    @Column(nullable = false)
    private boolean isPrincipal;
    private LocalDateTime createDate;

    @PrePersist // Se ejecuta antes de la primera inserción y pone la fecha actual
    protected  void onCreate() {
        this.createDate = LocalDateTime.now();
    }
}
