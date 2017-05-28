package com.training.adapter;

/**
 * Created by adame on 5/28/2017.
 */
public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Jamming on the mp3, " + filename + "!");
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            new MediaAdapter().play(audioType,filename);
        }
        else {
            System.out.println("No music for you!");
        }
    }
}
