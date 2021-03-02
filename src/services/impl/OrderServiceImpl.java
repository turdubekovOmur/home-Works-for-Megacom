package services.impl;

import enums.OrderStatus;
import enums.Unit;
import models.Order;
import models.Products;
import services.OrderService;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    private ArrayList<Order> orders = new ArrayList<>();

    private Order findOpenOrder(){
        for (Order item: orders) {
            if (item.getOrderStatus().equals(OrderStatus.OPEN)){
                return item;
            }
        }
        Order order = new Order();
        orders.add(order);
        return order;

    }

    @Override
    public void makeOrder(String productName, double amount, Unit unit) {
        Order order = findOpenOrder();
        Products products = new Products(productName, amount, unit);
        order.addProduct(products);
    }

    @Override
    public List<Order> findOrder() {
        return orders;
    }
}
