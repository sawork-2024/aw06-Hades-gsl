package com.hades.webpos.webposorder.web;

import com.hades.webpos.webposorder.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class OrderResource {
  private RestTemplate restTemplate;

  @Autowired
  public OrderResource(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @GetMapping("/order")
  public ResponseEntity<List<Order>> getOrder() {
    restTemplate.getForEntity(URI.create("lb://webpos-product-server/product/1"), float.class);

    simulateLoad(10);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  public void simulateLoad(int iterations) {
    for (int i = 0; i < iterations; i++) {
      fibonacci(i);
    }
  }

  private int fibonacci(int n) {
    if (n <= 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
