    package com.shop.miecomerce.model;

    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;

    import java.time.LocalDateTime;

    @Entity
    @Table(name = "products")
    @Getter @Setter
    @NoArgsConstructor @AllArgsConstructor
    public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(length = 50, nullable = false)
        private String name;
        @Column(nullable = false)
        private String description;
        @Column(nullable = false)
        private double price;
        @Column(nullable = false)
        private int stock;
        @Column(length =15, nullable = false)
        private String sku;
        private boolean isActive=true; // El producto está activo por defecto
        private LocalDateTime createDate;

        @PrePersist // Se ejecuta antes de la primera inserción y pone la fecha actual
        protected void onCreate() {
            this.createDate = LocalDateTime.now();
        }
    }
