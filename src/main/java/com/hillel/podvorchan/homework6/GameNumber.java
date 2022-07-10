package com.hillel.podvorchan.homework6;

import java.util.Scanner;

public class GameNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте задуманое число(5 попыток) Удачи");
        int a = (int) (Math.random() * 11);
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            if (a == number) {
                System.out.println("Поздравляю,Вы угадали!!!");
                break;
            } else if (a < number) {
                System.out.println("Не угадали.Число которое Вы указали ,больше загаданого");
            } else if (a > number) {
                System.out.println("Не угадали.Число которое Вы указали ,меньше загаданого");
            }
        }
        scanner.close();
    }
}
