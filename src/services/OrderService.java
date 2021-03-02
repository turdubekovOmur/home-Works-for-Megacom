package services;

import enums.Unit;
import models.Order;
import models.Products;
import services.impl.OrderServiceImpl;

import java.util.List;

public interface OrderService {
    OrderService INSTANCE = new OrderServiceImpl();
    void makeOrder(String productName, double amount, Unit unit);
    List<Order>  findOrder();
}
