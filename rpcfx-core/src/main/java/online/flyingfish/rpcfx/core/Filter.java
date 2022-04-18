package online.flyingfish.rpcfx.core;

public interface Filter {

    boolean filter(RpcfxRequest request);

    // Filter next();

}
