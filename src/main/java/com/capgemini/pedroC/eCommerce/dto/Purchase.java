package com.capgemini.pedroC.eCommerce.dto;

import com.capgemini.pedroC.eCommerce.entity.Address;
import com.capgemini.pedroC.eCommerce.entity.Customer;
import com.capgemini.pedroC.eCommerce.entity.Order;
import com.capgemini.pedroC.eCommerce.entity.OrderItem;

import java.util.Objects;
import java.util.Set;

public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return Objects.equals(customer, purchase.customer) && Objects.equals(shippingAddress, purchase.shippingAddress) && Objects.equals(billingAddress, purchase.billingAddress) && Objects.equals(order, purchase.order) && Objects.equals(orderItems, purchase.orderItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, shippingAddress, billingAddress, order, orderItems);
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "customer=" + customer +
                ", shippingAddress=" + shippingAddress +
                ", billingAddress=" + billingAddress +
                ", order=" + order +
                ", orderItems=" + orderItems +
                '}';
    }
}
