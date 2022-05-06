package com.genspark.SpringBootDemoApp.Service;

import com.genspark.SpringBootDemoApp.Dao.ProductDao;
import com.genspark.SpringBootDemoApp.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductDao productDao;

    public ProductServiceImp() {
    }

    @Override
    public List<Product> getAllProduct() {

        return this.productDao.findAll();
    }

    @Override
    public Product getProductById(int productID) {
        Optional <Product> p = this.productDao.findById(productID);
        Product product = null;
        if(p.isPresent()){
            product = p.get();
        } else {
            throw new RuntimeException(" Product not founf for id :: " + productID);
        }
        return product;
    }

    @Override
    public Product addProduct(Product product) {
        return this.productDao.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return this.productDao.save(product);
    }

    @Override
    public String deleteProductById(int productID) {

        this.productDao.deleteById(productID);

        return "Deleted Successfully";
    }


}
