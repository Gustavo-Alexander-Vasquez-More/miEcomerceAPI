package com.shop.miecomerce.service;

import com.shop.miecomerce.dto.ProductRequestDTO;
import com.shop.miecomerce.dto.ProductResponseDTO;
import com.shop.miecomerce.model.Product;
import com.shop.miecomerce.repository.PhotoRepository;
import com.shop.miecomerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO){
        String name = productRequestDTO.getName();
        String description = productRequestDTO.getDescription();
        Double price = productRequestDTO.getPrice();
        Integer stock = productRequestDTO.getStock();
        String sku = productRequestDTO.getSku();
        Product product=productRepository.save(new Product(name, description, price, stock, sku));
        return new ProductResponseDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getStock(),
                product.getSku(),
                product.isActive(),
                product.getCreateDate()
        );
    }
}
