package com.hillel.podvorchan.homework14;

public class RockMusic extends MusicStyles {
    @Override
    public String toString() {
        return "Maroon 5";
    }
    @Override
    void playMusic() {
        super.playMusic();
        System.out.println("Rock");
    }
}
