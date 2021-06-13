package com.project.springboot.ecommerce.service;

import com.project.springboot.ecommerce.dto.Purchase;
import com.project.springboot.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);

}
