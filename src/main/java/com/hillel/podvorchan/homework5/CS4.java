package com.hillel.podvorchan.homework5;

import java.util.Scanner;

public class CS4 {
    public static void main(String[] args) {
        String team1;
        String team2;
        int player;
        int team1player1, team1player2, team1player3, team1player4, team1player5,
                team2player1, team2player2, team2player3, team2player4, team2player5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первой команды");
        team1 = scanner.next();
        team1player1 = frag(scanner, player = 1);
        team1player2 = frag(scanner, player = 2);
        team1player3 = frag(scanner, player = 3);
        team1player4 = frag(scanner, player = 4);
        team1player5 = frag(scanner, player = 5);
        System.out.println("Введите имя второй команды");
        team2 = scanner.next();
        team2player1 = frag(scanner, player = 1);
        team2player2 = frag(scanner, player = 2);
        team2player3 = frag(scanner, player = 3);
        team2player4 = frag(scanner, player = 4);
        team2player5 = frag(scanner, player = 5);
        double meanTeam1 = (team1player1 + team1player2 + team1player3 + team1player4 + team1player5) / 5;
        System.out.println("Среднее значение команды " + team1 + " " + (double) meanTeam1);
        double meanTeam2 = (team2player1 + team2player2 + team2player3 + team2player4 + team2player5) / 5;
        System.out.println("Среднее значение команды " + team2 + " " + (double) meanTeam2);
        if (meanTeam1 > meanTeam2) {
            System.out.println("Победила команда " + team1 + " набравшая " + meanTeam1 + " очков");
        } else if (meanTeam1 < meanTeam2) {
            System.out.println("Победила команда " + team2 + " набравшая " + meanTeam2 + " очков");
        } else if (meanTeam1 == meanTeam2) {
            System.out.println("Боевая ничья)");
        }
    }static int frag(Scanner scanner, int player) {
        int numb = 0;
        System.out.println("Введите количество фрагов для игрока " + player);
        if (scanner.hasNextInt()) {
            numb = scanner.nextInt();
        } else {
            System.out.println("Не верные денные!!!");
            System.exit(0);
        }
        return numb;
    }
}
