package com.training.adapter;

/**
 * Created by adame on 5/28/2017.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing a lovely vlc song by the name of " + filename + ".");
    }

    @Override
    public void playMp4(String filename) {
        //do nothing.
    }
}
