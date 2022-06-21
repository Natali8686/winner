package ru.netology.domain;

public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone(int id, String productName, int cost, String manufacturer) {
        super(id, productName, cost);
        this.manufacturer = manufacturer;
    }
}
