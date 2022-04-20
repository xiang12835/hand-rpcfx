# hand-rpcfx
手写 RPC

>步骤 - 5 步

- 设计

共享：POJO实体类定义，接口定义。

REST/PB下，真的不需要嘛？另一种选择：WSDL/WADL/IDL

远程->服务提供者，本地->服务消费者。

------------ rpcfx 里的 api 子项目

- 代理

RPC是基于接口的远程服务调用。

Java下，代理可以选择动态代理，或者AOP实现

------------ rpcfx 里的默认使用**动态代理**


- 序列化

序列化和反序列化的选择：

1. 语言原生的序列化，RMI，Remoting
2. 二进制平台无关，Hessian，avro，kyro，fst等 3、文本，JSON、XML等

------------ rpcfx 里的默认使用 JSON


- 网络传输

最常见的传输方式：
1. TCP/SSL
2. HTTP/HTTPS

------------ rpcfx 里的默认使用 HTTP

- 查找实现类

通过接口查找具体的业务服务实现。

------------ rpcfx 里的默认使用 Spring getBean



