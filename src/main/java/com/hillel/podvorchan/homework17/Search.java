package com.hillel.podvorchan.homework17;

public class Search {
    public static int searchIndex(int[] array, int element) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
    public static boolean isSorted(int[] array) {
        if (array == null || array.length <= 1) {
            return true;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
