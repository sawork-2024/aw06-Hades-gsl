package com.hades.webpos.webposapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

  @RequestMapping("/fallback-product")
  public String fallbackProduct() {
    return "Product service is down";
  }

  @RequestMapping("/fallback-order")
  public String fallbackOrder() {
    return "Order service is down";
  }
}
