package com.hillel.podvorchan.homework14;

public class PopMusic extends MusicStyles {
    @Override
    public String toString() {
        return "OneRepublic";
    }
    @Override
    void playMusic() {
        super.playMusic();
        System.out.println("Pop");
    }
}

