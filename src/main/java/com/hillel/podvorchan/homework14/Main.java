package com.hillel.podvorchan.homework14;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        RockMusic rockMusic = new RockMusic();
        rockMusic.playMusic();
        System.out.println(rockMusic);
        PopMusic popMusic = new PopMusic();
        popMusic.playMusic();
        System.out.println(popMusic);
        ClassicMusic classicMusic = new ClassicMusic();
        classicMusic.playMusic();
        System.out.println(classicMusic);
        System.out.println("");
        MusicStyles[] musicStyles = {new RockMusic(), new PopMusic(), new ClassicMusic()};
        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();

        }

    }
}









