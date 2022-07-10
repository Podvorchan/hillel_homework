package com.hillel.podvorchan.homework6;

public class JapanMarsVer2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            if (!String.valueOf(i).contains("4") && !String.valueOf(i).contains("9")) {
                System.out.println(i);
            }
            i++;
        }
    }
}



