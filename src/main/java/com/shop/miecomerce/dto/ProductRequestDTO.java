package com.shop.miecomerce.dto;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ProductRequestDTO {
    @NotBlank(message = "El nombre del producto no puede estar vacío")
    private String name;
    @NotBlank(message = "La descripción del producto no puede estar vacía")
    private String description;
    @NotNull(message = "El precio del producto no puede ser nulo")
    @Min(value = 0, message = "El precio del producto no puede ser negativo")
    private Double price;
    @NotNull(message = "El stock del producto no puede ser nulo")
    @Min(value = 0, message = "El stock del producto no puede ser negativo")
    private Integer stock;
    @NotBlank(message = "El SKU del producto no puede estar vacío")
    private String sku;
}
