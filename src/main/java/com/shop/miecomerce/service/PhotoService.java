package com.shop.miecomerce.service;

import com.shop.miecomerce.dto.PhotoRequestDTO;
import com.shop.miecomerce.dto.PhotoResponseDTO;
import com.shop.miecomerce.repository.PhotoRepository;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {
  public final PhotoRepository photoRepository;

  public PhotoService(PhotoRepository photoRepository) {
      this.photoRepository = photoRepository;
  }

  public PhotoResponseDTO createPhoto(PhotoRequestDTO photoRequestDTO) {

  }
}
