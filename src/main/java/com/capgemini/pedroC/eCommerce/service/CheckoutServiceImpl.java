package com.capgemini.pedroC.eCommerce.service;

import com.capgemini.pedroC.eCommerce.dao.CustomerRepository;
import com.capgemini.pedroC.eCommerce.dto.Purchase;
import com.capgemini.pedroC.eCommerce.dto.PurchaseResponse;
import com.capgemini.pedroC.eCommerce.entity.Customer;
import com.capgemini.pedroC.eCommerce.entity.Order;
import com.capgemini.pedroC.eCommerce.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    private CustomerRepository customerRepository;

    @Autowired
    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {
        Order order = purchase.getOrder();

        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);

        Set<OrderItem> orderItems = purchase.getOrderItems();
        orderItems.forEach(order::add);

        order.setBillingAddress(purchase.getBillingAddress());
        order.setShippingAddress(purchase.getShippingAddress());

        Customer customer = purchase.getCustomer();

        String email = customer.getEmail();

        Customer customerFromDB = customerRepository.findByEmail(email);

        if (customerFromDB != null) {
            customer = customerFromDB;
        }

        customer.add(order);

        customerRepository.save(customer);

        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {
        return UUID.randomUUID().toString();
    }
}
