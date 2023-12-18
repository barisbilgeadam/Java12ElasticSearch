package com.barisd.java12elasticsearch.controller;

import com.barisd.java12elasticsearch.repository.ProductRepository;
import com.barisd.java12elasticsearch.repository.entity.Product;
import com.barisd.java12elasticsearch.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @PostMapping("/save")
    public ResponseEntity<Product> save(@RequestBody Product product){
        return ResponseEntity.ok(productService.save(product));
    }

    @GetMapping("/search/{keyword}")
    public ResponseEntity<List<Product>> findBySimilarName(@PathVariable String keyword){
        return ResponseEntity.ok(productService.findBySimilarName(keyword));
    }
}
