package com.hillel.podvorchan.homework15;

import java.util.Scanner;

public class Drinks {

    Scanner scanner = new Scanner(System.in);

    public static final int COFFEE_PRICE = 49;
    public static final int TEA_PRICE = 30;
    public static final int LEMONADE_PRICE = 70;
    public static final int MOJITO_PRICE = 75;
    public static final int MINERAL_WATER_PRICE = 16;
    public static final int COCA_COLA_PRICE = 27;
    private int coffee;
    private int tea;
    private int lemonade;
    private int mojito;
    private int mineralWater;
    private int cocaCola;
    private int total;
    public void coffee() {
        System.out.println("Чашка кофе стоит: " + COFFEE_PRICE + " ₴");
        System.out.print("Введите количество чашек кофе: ");
        coffee += scanner.nextInt();
        if (coffee == 1)
            System.out.println("Вы заказали : " + coffee + " чашку кофе");
        if (coffee >= 2 && coffee <= 4)
            System.out.println("Вы заказали : " + coffee + " чашки кофе");
        if (coffee >= 5)
            System.out.println("Вы заказали : " + coffee + " чашек кофе");

    }
    public void tea() {
        System.out.println("Чашка чая стоит: " + TEA_PRICE + " ₴");
        System.out.print("Введите количество чашек чая: ");
        tea += scanner.nextInt();
        if (tea == 1)
            System.out.println("Вы заказали : " + tea + " чашку чая");
        if (tea >= 2 && tea <= 4)
            System.out.println("Вы заказали : " + tea + " чашки чая");
        if (tea >= 5)
            System.out.println("Вы заказали : " + tea + " чашек чая");

    }

    public void lemonade() {
        System.out.println("Стакан лимонада стоит: " + LEMONADE_PRICE + " ₴");
        System.out.print("Введите количество стаканов лимонада: ");
        lemonade += scanner.nextInt();
        if (lemonade == 1)
            System.out.println("Вы заказали : " + lemonade + " стакан лимонада");
        if (lemonade >= 2 && lemonade <= 4)
            System.out.println("Вы заказали : " + lemonade + " стакана лимонада");
        if (lemonade >= 5)
            System.out.println("Вы заказали : " + lemonade + " стаканов лимонада");

    }

    public void mojito() {
        System.out.println("Стакан мохито стоит: " + MOJITO_PRICE + " ₴");
        System.out.print("Введите количество стаканов мохито: ");
        mojito += scanner.nextInt();
        if (mojito == 1)
            System.out.println("Вы заказали : " + mojito + " стакан мохито");
        if (mojito >= 2 && mojito <= 4)
            System.out.println("Вы заказали : " + mojito + " стакана мохито");
        if (mojito >= 5)
            System.out.println("Вы заказали : " + mojito + " стаканов мохито");

    }

    public void mineralWater() {
        System.out.println("Бутылка воды стоит: " + MINERAL_WATER_PRICE + " ₴");
        System.out.print("Введите количество бутылок воды: ");
        mineralWater += scanner.nextInt();
        if (mineralWater == 1)
            System.out.println("Вы заказали : " + mineralWater + " бутылку воды");
        if (mineralWater >= 2 && mineralWater <= 4)
            System.out.println("Вы заказали : " + mineralWater + " бутылки воды");
        if (mineralWater >= 5)
            System.out.println("Вы заказали : " + mineralWater + " бутылок воды");

    }

    public void cocaCola() {
        System.out.println("Банка кока колы стоит: " + COCA_COLA_PRICE + " ₴");
        System.out.print("Введите количество банок: ");
        cocaCola += scanner.nextInt();
        if (cocaCola == 1)
            System.out.println("Вы заказали : " + cocaCola + " банку кока колы");
        if (cocaCola >= 2 && mojito <= 4)
            System.out.println("Вы заказали : " + cocaCola + " банки кока колы");
        if (cocaCola >= 5)
            System.out.println("Вы заказали : " + cocaCola + " банок кока колы");

    }

    public void totalCost() {
        if (coffee != 0)
            System.out.println("--- Кофе " + coffee + " ,с Вас - " + (coffee * COFFEE_PRICE) + " ₴");
        if (tea != 0)
            System.out.println("--- Чай " + tea + " ,с Вас - " + (tea * TEA_PRICE) + " ₴");
        if (lemonade != 0)
            System.out.println("--- Лимонад" + lemonade + " ,с Вас - " + (lemonade * LEMONADE_PRICE) + " ₴");
        if (mojito != 0)
            System.out.println("--- Мохито " + mojito + " ,с Вас - " + (mojito * MOJITO_PRICE) + " ₴");
        if (mineralWater != 0)
            System.out.println("--- Минеральная вода " + mineralWater + " ,с Вас - " + (mineralWater * MINERAL_WATER_PRICE) + " ₴");
        if (cocaCola != 0)
            System.out.println("---Кока кола " + cocaCola + " ,с Вас - " + (cocaCola * COCA_COLA_PRICE) + " ₴");

        total = (coffee * COFFEE_PRICE) + (tea * TEA_PRICE) + (lemonade * LEMONADE_PRICE)
                + (mojito * MOJITO_PRICE) + (mineralWater * MINERAL_WATER_PRICE) + (cocaCola * COCA_COLA_PRICE);
        System.out.println("Итого:  "+total+" ₴");

    }
}
