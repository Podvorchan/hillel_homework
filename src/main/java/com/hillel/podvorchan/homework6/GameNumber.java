package com.hillel.podvorchan.homework6;

import java.util.Scanner;

public class GameNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте задуманое число от 0 до 10 (5 попыток) Удачи");
        int a = (int) (Math.random() * 11);
        int restart;
        do {
            boolean win = false;
            for (int i = 0; i < 5; i++) {
                int number = getNumber(scanner);
                if (a == number) {
                    System.out.println("Поздравляю,Вы угадали!!!");
                    win = true;
                    break;
                } else if (a < number) {
                    System.out.println("Не угадали.Число которое Вы указали ,больше загаданого");
                } else {
                    System.out.println("Не угадали.Число которое Вы указали ,меньше загаданого");
                }
            }
            System.out.println(win ? "Победа!!!" : "Проиграш!!!");
            System.out.println("Хотите еще раз? Если да нажмите 1,если нет нажмите 2");
            restart = re(scanner);
        } while (restart == 1);
        scanner.close();
    }
    static int getNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int result = scanner.nextInt();
                if (result >= 0 && result <= 10) {
                    return result;
                } else {
                    System.out.println("Пожайлуста введите число от 0 до 10");
                }
            } else {
                scanner.next();
                System.out.println("Вы ввели не правильное значение! Пожалуйста укажите число");
            }
        }
    }
    static int re(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int result = scanner.nextInt();
                if (result == 1 || result == 2) {
                    return result;
                } else {
                    System.out.println("Введите 1 или 2");
                    scanner.next();
                }
            }
        }
    }
}