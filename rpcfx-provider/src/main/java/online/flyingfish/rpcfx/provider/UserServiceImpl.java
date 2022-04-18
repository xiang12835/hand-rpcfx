package online.flyingfish.rpcfx.provider;

import online.flyingfish.rpcfx.api.User;
import online.flyingfish.rpcfx.api.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User findById(int id) {
        return new User(id, "KK" + System.currentTimeMillis());
    }
}
