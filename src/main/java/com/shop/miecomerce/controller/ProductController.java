package com.shop.miecomerce.controller;

import com.shop.miecomerce.dto.ProductRequestDTO;
import com.shop.miecomerce.dto.ProductResponseDTO;
import com.shop.miecomerce.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    public  final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/create")
    public ResponseEntity<ProductResponseDTO> createProduct(@Valid @RequestBody ProductRequestDTO productRequestDTO){
        ProductResponseDTO productResponse=productService.createProduct(productRequestDTO);
        return new ResponseEntity<>(productResponse, HttpStatus.CREATED);
    }
}
