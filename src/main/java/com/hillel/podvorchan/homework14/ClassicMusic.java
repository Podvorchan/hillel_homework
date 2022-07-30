package com.hillel.podvorchan.homework14;

public class ClassicMusic extends MusicStyles {
    @Override
    public String toString() {
        return "Antonio Lucio Vivaldi";
    }
    @Override
    void playMusic() {
        super.playMusic();
        System.out.println("Classic");
    }
}
