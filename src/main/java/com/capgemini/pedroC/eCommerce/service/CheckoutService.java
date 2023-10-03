package com.capgemini.pedroC.eCommerce.service;

import com.capgemini.pedroC.eCommerce.dto.Purchase;
import com.capgemini.pedroC.eCommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
