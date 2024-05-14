package com.hades.webpos.webposorder.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
    private String id;
    private String productId;
    private float price;
}
