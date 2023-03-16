package com.example.igofx;

import java.util.Date;

public class SmartCard {
    private int id;
    private Date validityDate;

    private double price;

    private String type;

    private Photo photo;



    public SmartCard(int id, Date date, double price, String type, Photo photo) {
        this.id = id;
        this.validityDate = date;
        this.price = price;
        this.type = type;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public Date getValidityDate() {
        return validityDate;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValidityDate(Date validityDate) {
        this.validityDate = validityDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SmartCard n° " + id + " - Validity date : " + validityDate + " - Price : " + price + " - Type : " + type;
    }
}
