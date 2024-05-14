package com.hades.webpos.webposproduct.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Product implements Serializable {
  private String id;
  private String name;
  private double price;
  private String img;
  private String category;
  private int stock;
  private int quantity;
}
