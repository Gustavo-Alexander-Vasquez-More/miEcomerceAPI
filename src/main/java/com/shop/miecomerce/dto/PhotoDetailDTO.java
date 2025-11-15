package com.shop.miecomerce.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class PhotoDetailDTO {
    @NotBlank(message = "La URL no puede estar vacía")
    private String url; //URL de la foto
    private boolean isPrincipal; //Indica si es la foto principal
}
