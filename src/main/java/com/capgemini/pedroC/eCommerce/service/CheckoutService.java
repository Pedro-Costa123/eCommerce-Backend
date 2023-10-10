package com.capgemini.pedroC.eCommerce.service;

import com.capgemini.pedroC.eCommerce.dto.PaymentInfo;
import com.capgemini.pedroC.eCommerce.dto.Purchase;
import com.capgemini.pedroC.eCommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
