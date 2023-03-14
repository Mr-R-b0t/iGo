package com.example.igofx;

public class SmartCard {
    private int id;
    private String validityDate;

    private int price;

    private String type;


    public SmartCard(int id, String validityDate, int price, String type) {
        this.id = id;
        this.validityDate = validityDate;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getValidityDate() {
        return validityDate;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValidityDate(String validityDate) {
        this.validityDate = validityDate;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SmartCard [id=" + id + ", validityDate=" + validityDate + ", price=" + price + ", type=" + type + "]";
    }


}
