package com.hillel.podvorchan.homework8;

import java.util.Arrays;

public class AgeGamer {
    public static void main(String[] args) {
        final int COUNT_PLAYERS = 25;
        int[] team1 = new int[COUNT_PLAYERS];
        int[] team2 = new int[COUNT_PLAYERS];
        int gam = 1;
        int gam2 = 1;
        int min = 18;
        int max = 41;

        System.out.println("Команда Динамо");
        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (Math.random() * (max - min) + min);
        }
        for (int i = 0; i < team1.length; i++) {
            System.out.println("Игрок под номером " + gam + " имеет возраст " + team1[i] + " года");

            gam++;
        }
        System.out.println("Команда Зоря");
        for (int a = 0; a < team2.length; a++) {
            team2[a] = (int) (Math.random() * (max - min) + min);
        }
        for (int a = 0; a < team2.length; a++) {
            System.out.println("Игрок под номером " + gam2 + " имеет возраст " + team2[a] + " года");

            gam2++;
        }
        double average = 0;
        if (team1.length > 0) {
            double sum = 0;
            for (int j = 0; j < team1.length; j++) {
                sum += team1[j];
                average = sum / team1.length;
            }
            System.out.println(Arrays.toString(team1));
            System.out.println(Arrays.toString(team2));
            System.out.println("Средний возраст команды Динамо " + average);
        }
        double average2 = 0;
        if (team2.length > 0) {
            double sum = 0;
            for (int j = 0; j < team2.length; j++) {
                sum += team2[j];
                average2 = sum / team2.length;
            }
            System.out.println("Средний возраст команды Зоря " + average2);
        }
    }
}





