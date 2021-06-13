package com.project.springboot.ecommerce.dto;

import lombok.Data;

@Data
public class PurchaseResponse {

    // Here we need to add final field.
    // Because, Lombok @Data will generate constructor for final fields or
    // we can add @NonNull annotation instead of final field.
    // eg:
    // @NotNull
    // private String orderTrackingNumber;
    private final String orderTrackingNumber;

}

