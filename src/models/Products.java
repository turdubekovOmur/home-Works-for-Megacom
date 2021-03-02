package models;

import enums.Unit;

public class Products {
    private double id;
    private String name;
    private double amount;
    private Unit unit;
    private String description;

    public Products(String name, double amount, Unit unit, String description) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
        this.description = description;
    }

    public Products(String name, double amount, Unit unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
