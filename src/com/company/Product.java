package com.company;

public class Product {
    String productName;
    String productCode;
    int productPrice;

    public Product(String ProductName, String ProductCode, int ProductPrice) {
        this.productName = ProductName;
        this.productCode = ProductCode;
        this.productPrice = ProductPrice;



    }

    public String getName() {
        return productName;
    }

    public String getCode() {
        return productCode;
    }

    public int getPrice() {
        return productPrice;
    }
}
