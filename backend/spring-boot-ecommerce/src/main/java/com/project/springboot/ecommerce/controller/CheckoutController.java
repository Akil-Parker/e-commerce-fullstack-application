package com.project.springboot.ecommerce.controller;


import com.project.springboot.ecommerce.dto.Purchase;
import com.project.springboot.ecommerce.dto.PurchaseResponse;
import com.project.springboot.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin //(origins = {"http://localhost:4200", "http://localhost:9876/"})
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}