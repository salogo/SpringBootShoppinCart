package com.genspark.SpringBootDemoApp.Dao;

import com.genspark.SpringBootDemoApp.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

}
