package com.training.adapter;

/**
 * Created by adame on 5/28/2017.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        //do nothing.
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing the sweet songs of the mp4.");
    }
}
