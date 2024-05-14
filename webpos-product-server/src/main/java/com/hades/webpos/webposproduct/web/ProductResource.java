package com.hades.webpos.webposproduct.web;

import com.google.common.annotations.GwtCompatible;
import com.hades.webpos.webposproduct.model.Product;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductResource {
  @GetMapping("/product")
  public ResponseEntity<List<Product>> getProduct() {
    try {
      simulateFileIoLoad(1500, 10);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return new ResponseEntity<>(HttpStatus.OK);
  }

  @GetMapping("/product/{id}")
  public float getProductById(@PathVariable("id") String id) {
    try {
      simulateFileIoLoad(1500, 1);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return 0.0f;
  }

  public void simulateFileIoLoad(int fileSize, int operations) throws IOException {
    Random random = new Random();
    byte[] buffer = new byte[fileSize];
    File tempFile = File.createTempFile("loadSimulator", ".tmp");
    try (OutputStream os = new FileOutputStream(tempFile)) {
      for (int i = 0; i < operations; i++) {
        random.nextBytes(buffer);
        os.write(buffer);
      }
    }
  }
}
