package com.hillel.podvorchan.homework12;

public class Fitness {
    public static void main(String[] args) {
        Person jenia = new Person("Yevhenii", 23, 11, 1990, "no", "0956211805", "Pavlov", 42, 120, 7500);
        jenia.printAccountInfo();
        Person nadiia = new Person("Nadiia", 21, 05, 1990, "nadindisain@ukr.net ", "0984347967", "Rusinova", 61, 90, 1120);
        nadiia.printAccountInfo();
        Person ruslan = new Person("Ruslan", 20, 7, 1988, "porubo@ukr.net", "0986226450", "Podvorchan", 87, 90, 11200);
        ruslan.printAccountInfo();
        ruslan.setSurname("Подворчан");
        ruslan.setWeight(85);
        ruslan.setPressure(100);
        ruslan.setStepsByDay(1445);
        ruslan.printAccountInfo();
        Person angelika = new Person("Angelika", 28, 10, 2007, "no", "0990931814", "Podvorchan", 55, 80, 12040);
        angelika.printAccountInfo();
        angelika.setSurname("Подворчан");
        angelika.setWeight(50);
        angelika.setPressure(110);
        angelika.setStepsByDay(15002);
        angelika.printAccountInfo();


    }
}