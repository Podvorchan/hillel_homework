package com.hillel.podvorchan.homework12;

public class Person {
    private final String name;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private final String email;
    private final String phone;
    private String surname;
    private int weight;
    private int pressure;
    private int stepsByDay;
    private int age;
    Person(String name, int dayOfBirth, int monthOfBirth,
           int yearOfBirth, String email, String phone,
           String surname, int weight, int pressure, int stepsByDay) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsByDay = stepsByDay;
        this.age = 2022 - yearOfBirth;
    }

    public String getName() {
        return this.name;
    }

    public int getDayOfBirth() {
        return this.dayOfBirth;
    }

    public int getMonthOfBirth() {
        return this.monthOfBirth;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getPressure() {
        return this.pressure;
    }

    public int getStepsByDay() {
        return this.stepsByDay;
    }

    public int getAge() {
        return this.age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    public void setStepsByDay(int stepsByDay) {
        this.stepsByDay = stepsByDay;
    }
    public void printAccountInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AccountInfo:\n" +
                "name " + this.name + "\n" +
                "dayOfBirth " + this.dayOfBirth + "\n" +
                "monthOfBirth " + this.monthOfBirth + "\n" +
                "yearOfBirth " + this.yearOfBirth + "\n" +
                "email " + this.email + "\n" +
                "phone " + this.phone + "\n" +
                "surname " + this.surname + "\n" +
                "weight " + this.weight + "\n" +
                "pressure " + this.pressure + "\n" +
                "stepsByDay " + this.stepsByDay + "\n" +
                "age " + this.age + "\n";
    }
}
