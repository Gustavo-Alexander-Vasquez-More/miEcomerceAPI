package com.shop.miecomerce.controller;

import com.shop.miecomerce.dto.PhotoResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/photos")
public class PhotoController {

    @PostMapping("/create")
    public ResponseEntity<PhotoResponseDTO> createPhoto() {
        PhotoResponseDTO response = new PhotoResponseDTO();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
