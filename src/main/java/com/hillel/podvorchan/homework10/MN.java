package com.hillel.podvorchan.homework10;

import java.util.Scanner;

public class MN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = size(scanner);
        int n = size(scanner);
        int[][] array = new int[m][n];
        int[][] array2 = new int[n][m];
        System.out.println("Оригинальная матрица");
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " \t");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++);
            }
        System.out.println("Новая матрица");
        System.out.println(" ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " \t");
                array2[i][j] = array[j][i];
            }
            System.out.println();
        }
        scanner.close();
    }static int size(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int result = scanner.nextInt();
                {
                    if (result >= 1 && result <= 9) {
                        return result;
                    } else {
                        System.out.println("Пожайлуста введите число от 1 до 9");
                    }
                }
            } else {
                System.out.println("Вы ввели не правильное значение! Пожалуйста укажите число");
                scanner.next();
            }
        }
    }
}
