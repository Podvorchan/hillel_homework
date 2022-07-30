package com.hillel.podvorchan.homework13;

public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Можно звонить");

    }

    @Override
    public void sms() {
        System.out.println("Можно писать сообщения");

    }

    @Override
    public void internet() {
        System.out.println("Можно пользоваться интернетом");

    }

    @Override
    public String os() {
        System.out.println(os);
        return os;

    }
}
