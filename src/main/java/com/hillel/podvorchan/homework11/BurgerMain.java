package com.hillel.podvorchan.homework11;

public class BurgerMain {
    public static void main(String[] args) {
        Burger full = new Burger();

        Burger light = new Burger(full.bun, full.meat, full.cheese, full.greens);

        Burger meat2 = new Burger(light.bun, full.meat1, light.cheese, light.greens, full.mayonnaise);


    }
}
