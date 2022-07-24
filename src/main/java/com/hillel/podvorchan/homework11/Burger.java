package com.hillel.podvorchan.homework11;

public class Burger {
    String bun = "Булочка", meat = " Мясо ", cheese = " Сыр ", greens = " Зелень ", mayonnaise = " Майонез ", meat1 = " двойное Мясо ";

    @Override
    public String toString() {
        return " ";
    }

    public Burger() {
        System.out.println("Состав " + bun + meat + cheese + greens + mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Состав " + bun + meat + cheese + greens + mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Состав " + bun + meat + cheese + greens);
    }

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise, String meat1) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.meat1 = meat1;
        System.out.println("Состав " + bun + "2x " + meat + cheese + greens);
    }
}













    /* Сделать класс Burger, который будет иметь поля:
    булочка, мясо, сыр, зелень, майонез

    Сделать три конструктора, которые будут позволять делать бургеры трех видов
    обычный бургер (все компоненты)
    диетический бургер (без майонеза)
    с двойным мясом
    В каждый конструктор добавить вывод в консоль состава данного варианта бургера (при создании экземпляра бургера использующего данный конструктор - будет выводиться в консоль его состав).
    Сделать класс BurgerMain, в котором создать три разных бургера. Их состав будет автоматически выводиться на экран при запуске программы.*/

