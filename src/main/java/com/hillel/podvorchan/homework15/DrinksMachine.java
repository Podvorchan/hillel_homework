package com.hillel.podvorchan.homework15;

public enum DrinksMachine {
    COFFEE("Кофе"),
    TEA("Чай"),
    LEMONADE("Лимонад"),
    MOJITO("Мохито"),
    MINERAL_WATER("Минеральная вода"),
    COCA_COLA("Кока кола");
    private String meaning;

    @Override
    public String toString() {
        return meaning;
    }
    public String getMeaning() {
        return meaning;
    }
    DrinksMachine(String meaning) {
        this.meaning = meaning;

    }
}
