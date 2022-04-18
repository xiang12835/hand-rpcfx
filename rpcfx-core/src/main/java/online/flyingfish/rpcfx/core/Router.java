package online.flyingfish.rpcfx.core;

import java.util.List;

public interface Router {

    List<String> route(List<String> urls);
}
