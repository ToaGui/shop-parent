package com.houzz.shop;

import com.houzz.shop.utils.IDWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author HouZZ
 **/

@SpringBootApplication
public class OrderWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderWebApplication.class,args);
    }

    @Bean
    public IDWorker getBean() {
        return new IDWorker(1, 1);
    }
}
