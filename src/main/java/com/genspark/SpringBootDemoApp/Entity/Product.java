package com.genspark.SpringBootDemoApp.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_products")
public class Product {

    @Id
    @Column(name = "p_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productid;
    private String name;
    private  String category;

    public Product() {
    }

    public Product(String name, String category) {// no need id because it will be auto generated
        this.name = name;
        this.category = category;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
