package com.project.shopapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDTO {

    @JsonProperty("order_id")
    @Min(value = 1, message = "Order's Id must be > 0")
    private long orderId;

    @JsonProperty("product_id")
    @Min(value = 1, message = "Product's Id must be > 0")
    private long productId;

    @Min(value = 0, message = "Price must be >= 0")
    private float price;

    @JsonProperty("number_of_products")
    @Min(value = 1, message = "Number of product must be > 0")
    private int numberOfProducts;

    @JsonProperty("total_money")
    @Min(value = 0, message = "Total Money must be >= 0")
    private float totalMoney;

    private String color;
}
