package com.hillel.podvorchan.homework13;

public class Main {
    public static void main(String[] args) {
        Androids androids = new Androids();
        IPhones iPhones = new IPhones();
        System.out.println("androids:");
        androids.call();
        androids.sms();
        androids.internet();
        androids.os();
        System.out.println("iPhones:");
        iPhones.call();
        iPhones.sms();
        iPhones.internet();
        iPhones.os();
    }

}
