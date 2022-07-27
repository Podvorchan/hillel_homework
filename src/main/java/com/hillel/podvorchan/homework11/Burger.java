package com.hillel.podvorchan.homework11;

public class Burger {
    String bun, meat, cheese, greens, mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Полный бургер: \n " +
                bun + "," +
                meat + "," +
                cheese + "," +
                greens + "," +
                mayonnaise);
    }
    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Бургер диетический,без майонеза: \n " +
                bun + "," +
                meat + "," +
                cheese + "," +
                greens);

    }
    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise, boolean meatDouble) {
        this.bun = bun;
        this.meat = (meatDouble ? " Двойное " : "") + meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Бургер с двойным мясом:\n " +
                this.bun + "," +
                this.meat + "," +
                this.cheese + "," +
                this.greens + "," +
                this.mayonnaise);
    }
    @Override
    public String toString() {
        return
                bun + "," +
                        meat + "," +
                        cheese + "," +
                        greens + "," +
                        mayonnaise;
    }
}

