package ru.netology.domain;


public class Product {
    protected int id;
    protected String productName;
    protected int cost;


    public Product(int id, String productName, int cost) {
        this.id = id;
        this.productName = productName;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
