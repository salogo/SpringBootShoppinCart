package com.genspark.SpringBootDemoApp.Controller;

import com.genspark.SpringBootDemoApp.Entity.Product;
import com.genspark.SpringBootDemoApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String home(){ return "<HTML> <H1> Welcome to Shopping Cart </H1> </HTML> ";
    }

    @GetMapping("/products")
    public List<Product> getProduct() {
        return this.productService.getAllProduct();
    }

    @GetMapping("/products/{productID}")
    public Product getProduct(@PathVariable String productID) {
        return this.productService.getProductById(Integer.parseInt(productID));
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product) {
        return this.productService.addProduct(product);
    }

    @PutMapping("/product")
    public Product updateProduct(@RequestBody Product product) {
        return this.productService.updateProduct(product);
    }

    public String deleteProduct(@PathVariable String productID) {
        return this.productService.deleteProductById(Integer.parseInt(productID));
    }






}
