package ru.netology.domain;

public class Book extends Product {
    private String authorName;


    public Book(int id, String productName, int cost, String authorName) {
        super(id, productName, cost);
        this.authorName = authorName;
    }
}
