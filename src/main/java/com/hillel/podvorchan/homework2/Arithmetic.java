package com.hillel.podvorchan.homework2;

public class Arithmetic {
    public static void main(String[] args) {
        String name = "Прямоугольный Параллелепипед";
        byte a = 10;
        byte b = 6;
        float c = 7.5F;
        short volume = (short) ((short) a*b*c);
        System.out.println(name);
        System.out.println(volume);
        System.out.println("a*b*c="+volume);

        float length = ((4*a)+(4*b)+(4*c));
        System.out.println(length);
        System.out.println("(4*a)+(4*b)+(4*c)="+length);}}
