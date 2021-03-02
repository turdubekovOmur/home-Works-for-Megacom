package models;

import enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private double id;
    private Date startDate;
    private OrderStatus orderStatus;
    private List<Products> products = new ArrayList<>();

    public Order() {
        this.id = Math.random();
        this.startDate = new Date();
        this.orderStatus = OrderStatus.OPEN;
        this.products = new ArrayList<>();
    }

    public double getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void addProduct(Products product){
        this.products.add(product);
    }
}
