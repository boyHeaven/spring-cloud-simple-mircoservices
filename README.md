# spring-cloud-simple-mircoservices

## 学习SpringCloud搭建的微服务事例，主要分为：

Register：服务注册 
    当Eureka客户端向Eureka Server注册时，它提供自身的元数据
        比如IP地址、端口，运行状况指示符URL，主页等

Renew：服务续约 
    Eureka客户会每隔30秒发送一次心跳来续约。 
        通过续约来告知Eureka Server该Eureka客户仍然存在，没有出现问题。
        如果Eureka Server在90秒没有收到Eureka客户的续约，它会将实例从其注册表中删除。 建议不要更改续约间隔。

Fetch Registries：获取注册列表信息 
    Eureka客户端从服务器获取注册表信息，并将其缓存在本地。
        客户端会使用该信息查找其他服务，从而进行远程调用。该注册列表信息定期（每30秒钟）更新一次。
        每次返回注册列表信息可能与Eureka客户端的缓存信息不同， Eureka客户端自动处理。
        如果由于某种原因导致注册列表信息不能及时匹配，Eureka客户端则会重新获取整个注册表信息。 
        Eureka服务器缓存注册列表信息，整个注册表以及每个应用程序的信息进行了压缩，压缩内容和没有压缩的内容完全相同。
        Eureka客户端和Eureka 服务器可以使用JSON / XML格式进行通讯。
        默认的情况下Eureka客户端使用压缩JSON格式来获取注册列表的信息。

Cancel：服务下线 
    Eureka客户端在程序关闭时向Eureka服务器发送取消请求。 
        发送请求后，该客户端实例信息将从服务器的实例注册表中删除。
        该下线请求不会自动完成，它需要调用以下内容： DiscoveryManager.getInstance().shutdownComponent()；

Eviction 服务剔除 
    当Eureka客户端连续90秒没有向Eureka服务器发送服务续约，即心跳。
    Eureka服务器会将该服务实例从服务注册列表删除，即服务剔除。


一、中心服务：eureka-server
二、客户端
   1、服务提供者：department-service
   2、服务提供者：employee-service
   3、服务消费者：中间组合服务：composite-service

WARNING: 
1、注意依赖版本问题
2、RIBBON和FEIGN之间，直接使用FEIGN，因为继承了RIBBON的一些功能，更加强大和易于使用。 
3、开启Hystrix容器器和配合FeignClient有不同的方式
    fallbackFactory:需要实现FallbackFactory，有个重写的方法可以传递异常信息
    fallback：需要重写client，实现方法返回默认值，与factory区别在于有无异常

三、配置服务
    1、api 网关
    



      