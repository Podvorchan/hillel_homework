package com.hillel.podvorchan.homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Loto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int second[] = new int[7];
        {
            int first[] = new int[7];
            for (int i = 0; i < first.length; i++) {
                first[i] = (int) (Math.random() * 10);
            }
            Arrays.sort(first);
            System.out.println("Введите 7 цифр от 0 до 9: ");
            for (int i = 0; i < second.length; i++) {
                second[i] = CorrectInput(scanner);
            }
            Arrays.sort(second);
            System.out.print(Arrays.toString(first));
            System.out.println("");
            System.out.print(Arrays.toString(second));
            int count = 0;

            for (int i = 0; i < 7; i++) {
                if (first[i] == second[i]) count++;
            }
            System.out.println("");
            System.out.println("Совпадений " + count);
        }
        scanner.close();
    }static int CorrectInput(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {

                int result = scanner.nextInt();
                {
                    if (result >= 0 && result <= 9) {
                        return result;
                    } else {
                        System.out.println("Пожайлуста введите число от 0 до 9");
                    }
                }
            } else {
                System.out.println("Вы ввели не правильное значение! Пожалуйста укажите число");
                scanner.next();
            }
        }
    }
}



