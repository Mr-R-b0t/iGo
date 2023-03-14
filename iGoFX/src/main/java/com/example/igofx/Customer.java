package com.example.igofx;

import java.util.Date;

public class Customer extends Person {
    private int costumerId;
    private String typeOfCostumer;

    public Customer(int id, String name, int phoneNumber, Date dateOfBirth, String typeOfCostumer) {
        super(id, name, phoneNumber, dateOfBirth);
        this.typeOfCostumer = typeOfCostumer;
    }

    public int getCostumerId() {
        return costumerId;
    }

    public String getTypeOfCostumer() {
        return typeOfCostumer;
    }

}
