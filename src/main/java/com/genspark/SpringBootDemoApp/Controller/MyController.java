package com.genspark.SpringBootDemoApp.Controller;

import com.genspark.SpringBootDemoApp.Entity.Product;
import com.genspark.SpringBootDemoApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
