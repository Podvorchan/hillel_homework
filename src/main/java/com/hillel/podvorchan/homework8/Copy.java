package com.hillel.podvorchan.homework8;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        sum();
        System.out.println();
        int[] source = {1, 2, 3, 4};
        int[] target = copyArray(source);
        if (Arrays.equals(source, target)) ;
        {
            System.out.println(Arrays.toString(target));
            System.out.println(Arrays.toString(source));
        }
    }private static int[] copyArray(int[] source) {
        int a = source.length;
        int[] target = new int[a];
        for (int i = 0; i < a; i++) {
            target[i] = source[i];
        }
        return target;
    }static void sum() {
        int[] source = {1, 2, 3, 4};
        int[] target = {5, 6, 7};
        int[] sum = new int[source.length + target.length];
        int count = 0;
        for (int i = 0; i < source.length; i++) {
            sum[i] = source[i];
            count++;
        }
        for (int j = 0; j < target.length; j++) {
            sum[count++] = target[j];
        }
        for (int i = 0; i < sum.length; i++)
            System.out.print(sum[i] + " ");
    }
}
