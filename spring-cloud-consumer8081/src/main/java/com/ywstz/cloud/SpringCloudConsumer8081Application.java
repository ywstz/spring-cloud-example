package com.ywstz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * TuoZhou
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class SpringCloudConsumer8081Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumer8081Application.class, args);
    }

}
