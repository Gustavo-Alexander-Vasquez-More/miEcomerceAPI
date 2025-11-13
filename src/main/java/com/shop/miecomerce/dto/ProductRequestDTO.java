package com.shop.miecomerce.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ProductRequestDTO {
    private String name;
    private String description;
    private Double price;
    private Integer stock;
    private String sku;
}
