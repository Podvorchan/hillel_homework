package models;

import base.Fiscal;
import base.Income;

public class Product implements Fiscal, Income {
    private String name;
    private int quantity;
    private double price;
    static final double TAXRATE = 0.05;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getIncome(int quantity, double price) {
        return quantity * price;
    }
    public double getFiscal(int quantity, double price) {
        return quantity * price * TAXRATE;
    }
    public double getProfit(int quantity, double price) {
        return ((quantity * price) - (quantity * price * TAXRATE));
    }

}
