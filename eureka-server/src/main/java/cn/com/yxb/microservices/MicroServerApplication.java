package cn.com.yxb.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
@SpringBootApplication
@EnableEurekaServer
public class MicroServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(MicroServerApplication.class, args);
    }

}
