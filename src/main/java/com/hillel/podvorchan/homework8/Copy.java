package com.hillel.podvorchan.homework8;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        int[] target = {5, 6, 7};
        int[] source = {1, 2, 3, 4};
        System.out.println("source " + Arrays.toString(source));
        System.out.println("target " + Arrays.toString(target));
        target = copyArray(source, target);
        System.out.println("target " + Arrays.toString(target));
    }static int[] copyArray(int[] target, int[] source) {
        int[] resoul = new int[source.length + target.length];
        int count = 0;
        for (int i = 0; i < source.length; i++) {
            resoul[i] = source[i];
            count++;
        }
        for (int j = 0; j < target.length; j++) {
            resoul[count++] = target[j];
        }
        for (int i = 0; i < resoul.length; i++) {
        }
        return resoul;
    }
}
