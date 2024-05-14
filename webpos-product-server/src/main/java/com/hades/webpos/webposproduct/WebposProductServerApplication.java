package com.hades.webpos.webposproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WebposProductServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(WebposProductServerApplication.class, args);
  }
}
