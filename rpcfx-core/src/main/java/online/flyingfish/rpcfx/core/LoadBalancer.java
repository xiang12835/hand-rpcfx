package online.flyingfish.rpcfx.core;

import java.util.List;

public interface LoadBalancer {

    String select(List<String> urls);

}
