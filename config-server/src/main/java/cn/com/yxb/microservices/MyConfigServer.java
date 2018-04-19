package cn.com.yxb.microservices;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created on 2017/10/12.
 *
 * @author frank.
 */
@SpringBootApplication
@EnableConfigServer
public class MyConfigServer implements CommandLineRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MyConfigServer.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("启动==========");
    }
}
