package online.flyingfish.rpcfx.demo.provider;

import online.flyingfish.rpcfx.demo.api.Order;
import online.flyingfish.rpcfx.demo.api.OrderService;

public class OrderServiceImpl implements OrderService {

    @Override
    public Order findOrderById(int id) {
        return new Order(id, "Cuijing" + System.currentTimeMillis(), 9.9f);
    }
}
