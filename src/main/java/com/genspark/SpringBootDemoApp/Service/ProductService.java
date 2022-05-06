package com.genspark.SpringBootDemoApp.Service;

import com.genspark.SpringBootDemoApp.Entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProduct();
    Product getProductById(int productID);
    Product addProduct(Product product);
    Product updateProduct(Product product);
    String deleteProductById(int productID);

}
