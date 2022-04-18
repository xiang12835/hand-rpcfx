package online.flyingfish.rpcfx.demo.provider;

import online.flyingfish.rpcfx.demo.api.User;
import online.flyingfish.rpcfx.demo.api.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User findById(int id) {
        return new User(id, "KK" + System.currentTimeMillis());
    }
}
