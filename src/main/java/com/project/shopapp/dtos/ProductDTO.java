package com.project.shopapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    @NotBlank(message = "Title is requires")
    @Size(min = 3, max = 200, message = "Title must be between 3 and 200 characters")
    String name;

    @Min(value = 0, message = "Price must be greater than or equals to 0")
    @Max(value = 10000000, message = "Price must be less than or equals to 10,000,000")
    Float price;

    String thumbnail;
    String description;

    @JsonProperty("category_id")
    long categoryId;

    List<MultipartFile> files;
}
