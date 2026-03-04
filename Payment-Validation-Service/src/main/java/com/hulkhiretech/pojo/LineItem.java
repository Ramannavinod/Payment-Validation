package com.hulkhiretech.pojo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.Data;

@Data
public class LineItem {

    @Min(value = 1, message = "Quantity must be at least 1")
    private int quantity;

    @NotBlank(message = "Product name is required")
    private String productName;

    @NotBlank(message = "Currency is required")
    private String currency;

    @NotNull(message = "Unit amount is required")
    @Min(value = 1, message = "Unit amount must be greater than 0")
    private Long unitAmount;
}