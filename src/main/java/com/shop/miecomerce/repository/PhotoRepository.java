package com.shop.miecomerce.repository;

import com.shop.miecomerce.entity.PhotoEntity;
import com.shop.miecomerce.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PhotoRepository extends JpaRepository<PhotoEntity, Long> {

    Optional<PhotoEntity> findByProductAndIsPrincipalTrue(ProductEntity product);
}
