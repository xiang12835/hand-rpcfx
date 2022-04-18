package online.flyingfish.rpcfx.provider;

import online.flyingfish.rpcfx.api.Order;
import online.flyingfish.rpcfx.api.OrderService;

public class OrderServiceImpl implements OrderService {

    @Override
    public Order findOrderById(int id) {
        return new Order(id, "Cuijing" + System.currentTimeMillis(), 9.9f);
    }
}
