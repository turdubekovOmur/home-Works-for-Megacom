import enums.Unit;
import models.Order;
import models.Products;
import services.OrderService;
import services.impl.OrderServiceImpl;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = OrderService.INSTANCE;
        orderService.makeOrder("Milk",3, Unit.L);
        orderService.makeOrder("Beer",100, Unit.L);
        orderService.makeOrder("Winston",10, Unit.PIECE);

        for (Order item: orderService.findOrder()) {
            
            System.out.println(item.getStartDate());
            System.out.println(item.getOrderStatus());

            System.out.println("Список продуктов: ");
            for (Products item2: item.getProducts()) {
                System.out.println(item2.getName() + " - " + item2.getAmount() + " " + item2.getUnit());
            }
        }

    }
}
