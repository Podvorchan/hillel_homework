package com.hillel.podvorchan.homework15;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Drinks drinks = new Drinks();
        DrinksMachine.values();
        boolean vybor = true;
        while (vybor) {
            System.out.println("Выберите напиток: ");
            System.out.println(Arrays.toString(DrinksMachine.values()));
            System.out.println("Ввод для кофе: COFFEE; для чая:TEA; для лимонада:LEMONADE" +
                    "; для мохито: MOJITO; для минеральной воды :MINERAL_WATER; " +
                    "для кока колы:COCA_COLA");
            String choice = scanner.nextLine();
            choice = choice.toUpperCase();
            DrinksMachine drinksMachine = DrinksMachine.valueOf(choice);
            switch (drinksMachine) {
                case COFFEE:
                    drinks.coffee();
                    break;
                case TEA:
                    drinks.tea();
                    break;
                case LEMONADE:
                    drinks.lemonade();
                    break;
                case MOJITO:
                    drinks.mojito();
                    break;
                case MINERAL_WATER:
                    drinks.mineralWater();
                    break;
                case COCA_COLA:
                    drinks.cocaCola();
                    break;
                default:
                    System.out.println("ERROR");
            }
            System.out.println("Желаете чего-нибудь еще? Если да введите YES,если нет то NO");
            boolean more = true;
            while (more) {
                String answer = scanner.nextLine();

                if (answer.equals("NO") || answer.equals("No") || answer.equals("no")) {
                    more = false;
                    vybor = false;
                } else if (answer.equals("Yes") || answer.equals("YES") || answer.equals("yes")) {
                    more = false;
                } else {
                    System.out.println("Введите только YES/NO");
                }
            }
        }
        drinks.totalCost();

    }

}
