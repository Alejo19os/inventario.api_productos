package com.inventario.api_productos.controller;

import com.inventario.api_productos.entity.Product;
import com.inventario.api_productos.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/productos")
public class productController {

    @Autowired
    private ProductService productService;

    //Get all products
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    //Get by id
    @GetMapping("/id")
    public ResponseEntity<Product> getProductById(Long id) {
        return productService.getProductById(id)
                .map(product -> ResponseEntity.ok(product))
                .orElse(ResponseEntity.notFound().build());
    }

}
