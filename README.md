# spring-cloud-simple-mircoservices

## 学习SpringCloud搭建的微服务事例，主要分为：
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
      