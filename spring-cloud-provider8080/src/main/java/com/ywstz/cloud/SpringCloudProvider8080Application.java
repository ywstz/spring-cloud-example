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
public class SpringCloudProvider8080Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider8080Application.class, args);
    }

}
