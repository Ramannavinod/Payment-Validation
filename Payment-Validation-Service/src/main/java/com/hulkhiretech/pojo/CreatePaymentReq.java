package com.hulkhiretech.pojo;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CreatePaymentReq {

    @NotBlank(message = "Success URL is required")
    private String successurl;

    @NotBlank(message = "Cancel URL is required")
    private String cancelurl;

    @NotBlank(message = "Mode is required")
    private String mode;

    @NotEmpty(message = "At least one line item is required")
    @Valid   // ✅ Important for validating nested object
    private List<LineItem> lineitems;
}