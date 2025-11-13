package com.shop.miecomerce.repository;

import com.shop.miecomerce.model.Photo;
import com.shop.miecomerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {
    Optional<Photo> findByProductAndIsPrincipal(Product product, boolean isPrincipal);
}
