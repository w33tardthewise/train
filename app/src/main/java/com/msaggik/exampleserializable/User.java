package com.msaggik.exampleserializable;

import java.io.Serializable;

public class User implements Serializable {

    // поля сущности
    private String name;
    private String city;
    private String cost;
    // необходимый конструктор
    public User(String name, String city, String cost) {
        this.name = name;
        this.city = city;
        this.cost = cost;
    }

    // геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setCity(String address) {
        this.city = city;
    }
}
