package com.hillel.podvorchan.homework11;

public class BurgerMain {
    public static void main(String[] args) {
        Burger fullBurger = new Burger("Булочка", " Мясо ", " Сыр ", " Зелень ", " Майонез ");
        System.out.println();
        Burger burgerDietary = new Burger("Булочка", " Мясо ", " Сыр ", " Зелень ");
        System.out.println();
        Burger burgerMeatDouble = new Burger("Булочка", " Мясо ", " Сыр ", " Зелень ", " Майонез ", true);


    }

}