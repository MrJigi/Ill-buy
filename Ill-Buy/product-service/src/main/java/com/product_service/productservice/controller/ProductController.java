package com.product_service.productservice.controller;

import com.product_service.productservice.dto.Product.ProductRequest;
import com.product_service.productservice.model.Product;
import com.product_service.productservice.service.ProductService;
import jakarta.servlet.annotation.HttpConstraint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){this.productService = productService;}

    @GetMapping("/getAll")
    public List<Product> getAllProducts() {return productService.getAllProducts();}

    @GetMapping("/test")
    @ResponseStatus(HttpStatus.OK)
    public void addTest(){
        productService.addTestProducts();
    }
//Crud
    @GetMapping("/{id}")
    public Product getUser(@PathVariable Integer id) {return productService.getProductById(id); }

    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);
    }





}
