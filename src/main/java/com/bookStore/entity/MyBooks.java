package com.bookStore.entity;

import jakarta.persistence.*;

@Entity
@Table(name="mybook")
public class MyBooks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String auther;
    @Column
    private String price;
    public MyBooks(String name, String auther, String price) {
        this.name = name;
        this.auther = auther;
        this.price = price;
    }

    public MyBooks() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
