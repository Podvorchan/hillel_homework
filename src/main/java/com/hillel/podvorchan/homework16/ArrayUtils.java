package com.hillel.podvorchan.homework16;

public class ArrayUtils {
    int[][] array;

    public static double average(int[][] array) {
        double summa = 0;
        int kolichestvo = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                summa += array[i][j];
                kolichestvo++;
            }
        }
        return summa / kolichestvo;
    }

    public static boolean rowСolumn(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                return false;
            }
        }
        return true;
    }

    public static void demoException() {
        throw new IllegalArgumentException("MY ERROR!!!");
    }
}