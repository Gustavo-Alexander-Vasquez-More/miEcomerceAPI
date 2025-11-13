package com.shop.miecomerce.model;

import com.shop.miecomerce.util.StatusOrder;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numOrder;
    private int nameClient;
    private String emailClient;
    @Column(length =15 ,nullable = false)
    private String phoneClient;
    @Column(nullable = false)
    private String addressClient;
    private StatusOrder statusOrder=StatusOrder.PENDING;
    @Column(nullable = false)
    private Double totalPrice;
    @Column(nullable = false)
    private LocalDateTime createDate;

    @PrePersist
    protected void onCreate() {
        this.createDate = LocalDateTime.now();
    }
}
