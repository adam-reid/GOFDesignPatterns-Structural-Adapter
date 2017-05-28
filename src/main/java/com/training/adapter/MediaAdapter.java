package com.training.adapter;

/**
 * Created by adame on 5/28/2017.
 */
public class MediaAdapter implements MediaPlayer{

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("vlc")) {
            new VlcPlayer().playVlc(filename);
        }
        else if (audioType.equalsIgnoreCase("mp4")) {
            new Mp4Player().playMp4(filename);
        }
        else {
            System.out.println("no music for you!");
        }
    }
}
