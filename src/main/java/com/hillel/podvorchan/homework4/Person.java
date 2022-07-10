package com.hillel.podvorchan.homework4;

public class Person {

    public static void main(String[] args) {
        String name = "Sherlock";
        String surname = "Holmes";
        String citi = "London";
        String phone = "37742123513";
        personInfo(name, surname, citi, phone);
        System.out.println();
        String name1 = "Will";
        String surname1 = "Smith";
        String citi1 = "New York";
        String phone1 = "2936729462846";
        personInfo(name1, surname1, citi1, phone1);
        System.out.println();
        String name2 = "Jackie";
        String surname2 = "Chan ";
        String citi2 = "Shanghaik";
        String phone2 = "12312412412";
        personInfo(name2, surname2, citi2, phone2);
        System.out.println();
    }static String personInfo(String name, String surname, String citi, String phone) {
        System.out.println("Позвонить гражданину "
                + name + surname + " из города " + citi +
                " можно по телефону " + phone);
        return phone;


    }


}
