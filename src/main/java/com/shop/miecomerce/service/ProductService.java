package com.shop.miecomerce.service;

import com.shop.miecomerce.dto.ProductRequestDTO;
import com.shop.miecomerce.repository.PhotoRepository;
import com.shop.miecomerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public final ProductRepository productRepository;
    public final PhotoRepository photoRepository;

    public ProductService(ProductRepository productRepository, PhotoRepository photoRepository) {
        this.productRepository = productRepository;
        this.photoRepository = photoRepository;
    }

}
