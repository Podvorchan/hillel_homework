package com.hillel.povorchan.homework4;

public class Zoo {
    public static void main(String[] args) {
        int minAmount = 2;
        int maxAmount = 30;
        int bear = minAmount + (int) (Math.random() * maxAmount) + 1;
        int tiger = minAmount + (int) (Math.random() * maxAmount) + 1;
        int parrot = minAmount + (int) (Math.random() * maxAmount) + 1;
        int elephant = minAmount + (int) (Math.random() * maxAmount) + 1;
        int raccoon = minAmount + (int) (Math.random() * maxAmount) + 1;
        int monkey = minAmount + (int) (Math.random() * maxAmount) + 1;
        countAnimals(bear, tiger, parrot, elephant, raccoon);
        countAnimalsNextYear(bear, tiger, parrot, elephant, raccoon);
        countAnimalsMonkey(bear, tiger, parrot, elephant, raccoon, monkey);
    }static void countAnimals(int bear, int tiger, int parrot, int elephant, int raccoon) {
        System.out.println("bear " + bear);
        System.out.println("tiger " + tiger);
        System.out.println("parrot " + parrot);
        System.out.println("elephant " + elephant);
        System.out.println("raccoon " + raccoon);
    }static void countAnimalsNextYear(int bear, int tiger, int parrot, int elephant, int raccoon) {
        int bear1 = (int) ((bear * 0.3) + bear);
        int tiger1 = (int) ((tiger * 0.2) + tiger);
        int parrot1 = (int) ((parrot * 0.4) + parrot);
        int elephant1 = (int) ((elephant * 0.05) + elephant);
        int raccoon1 = (int) ((raccoon * 0.8) + raccoon);
        System.out.println("bear NextYear " + bear1);
        System.out.println("tiger NextYear " + tiger1);
        System.out.println("parrot NextYear " + parrot1);
        System.out.println("elephant NextYear " + elephant1);
        System.out.println("raccoon NextYear " + raccoon1);
    }static void countAnimalsMonkey(int bear, int tiger, int parrot, int elephant, int raccoon, int monkey) {
        int bear1 = (int) ((bear * 0.3) + bear);
        int tiger1 = (int) ((tiger * 0.2) + tiger);
        int parrot1 = (int) ((parrot * 0.4) + parrot);
        int elephant1 = (int) ((elephant * 0.05) + elephant);
        int raccoon1 = (int) ((raccoon * 0.8) + raccoon);
        int monkey1 = (int) ((monkey * 0.6) + monkey);
        System.out.println("monkey " + monkey);
        System.out.println("bear NextYear " + bear1);
        System.out.println("tiger NextYear " + tiger1);
        System.out.println("parrot NextYear " + parrot1);
        System.out.println("elephant NextYear " + elephant1);
        System.out.println("raccoon NextYear " + raccoon1);
        System.out.println("monkey NextYear " + monkey1);

    }

}