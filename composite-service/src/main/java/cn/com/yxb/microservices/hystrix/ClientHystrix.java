package cn.com.yxb.microservices.hystrix;

import feign.Feign;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
@Configurable
public class ClientHystrix {

    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }
}
