package com.hillel.podvorchan.xoxo;

import java.util.Scanner;

public class xoxo5 {
    public static final int ROW = 3, COLUMN = 3;
    public static int status;
    public static final int PROCESS = 0, DRAW = 1, WIN_X = 3, WIN_O = 4;
    public static final String EMPTY = "   ", ZERO = " O ", CROSS = " X ";
    public static String[][] field = new String[ROW][COLUMN];
    public static String active;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        game();
        int restart;
        while (true){
        System.out.println("Хотите еще раз? Если да нажмите 1,если нет нажмите 2");
        restart = re(scanner);
        if (restart == 1) {
           game();}}
    }public static void fieldview() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                System.out.print(field[i][j]);
                if (j != COLUMN - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i != ROW - 1) {
                System.out.println("------------");
            }
        }
        System.out.println();
    }public static void start() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                field[i][j] = EMPTY;
            }
        }
        active = CROSS;
        fieldview();
    }public static void player() {
        boolean input = false;
        do {
            System.out.println("Игрок " + active + " введите ряд(1-3) и столбец (1-3),через пробел и нажмите enter");
            int i = scanner.nextInt() - 1;
            int j = scanner.nextInt() - 1;
            if (i >= 0 && i < ROW && j >= 0 && j < COLUMN && field[i][j] == EMPTY) {
                field[i][j] = active;
                input = true;
            } else {
                System.out.println("Это значение(" + (i + 1) + "." + (j + 1) + ") не может быть выбранно, " +
                        "попробуйте еще раз!");
            }
        }
        while (!input);
    }public static String winview() {
        int coincidence;
        for (int i = 0; i < ROW; i++) {
            coincidence = 0;
            for (int j = 0; j < COLUMN; j++) {
                if (field[i][0] != EMPTY && field[i][0] == field[i][j]) {
                    coincidence++;
                }
            }
            if (coincidence == 3) {
                return field[i][0];
            }
        }
        for (int j = 0; j < COLUMN; j++) {
            coincidence = 0;
            for (int i = 0; i < ROW; i++) {
                if (field[0][j] != EMPTY && field[0][j] == field[i][j]) {
                    coincidence++;
                }
                if (coincidence == 3) {
                    return field[0][j];
                }
            }
            if (field[0][0] != EMPTY && field[0][0] == field[1][1] && field[0][0] == field[2][2]) {
                return field[0][0];
            }
            if (field[0][2] != EMPTY && field[1][1] == field[0][2] && field[0][2] == field[2][0]) {
                return field[0][2];
            }
        }
        return EMPTY;
    }public static boolean filling() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                if (field[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }public static void analysis() {
        String winner = winview();
        if (winner.equals(CROSS)) {
            status = WIN_X;
        } else if (winner.equals(ZERO)) {
            status = WIN_O;
        } else if (filling()) {
            status = DRAW;
        } else {
            status = PROCESS;
        }
    }static int re(Scanner scanner) {
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
    }public static void game() {
        start();
        do {
            player();
            analysis();
            fieldview();
            if (status == WIN_X) {
                System.out.println("Победил крестик");
            } else if (status == WIN_O) {
                System.out.println("Победил нолик");
            } else if (status == DRAW) {
                System.out.println("Ничья");
            }
            active = (active == CROSS ? ZERO : CROSS);

        } while (status == PROCESS);
    }
}