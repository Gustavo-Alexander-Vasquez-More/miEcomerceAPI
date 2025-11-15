package com.shop.miecomerce.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class PhotoRequestDTO {
    @NotNull(message = "El ID del producto no puede ser nulo")
    private Long productId;
    @NotNull(message = "La lista de fotos no puede ser nula")
    @Size(min = 1, message = "Debe haber al menos una foto")
    private List<PhotoDetailDTO> photos; //Lista de fotos con DTO anidado, esto permite validar cada foto individualmente si esque hay mas de 1 foto.
}
