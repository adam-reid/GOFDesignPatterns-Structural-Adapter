package com.training.adapter;

/**
 * Created by adame on 5/28/2017.
 */
public class MediaAdapter implements MediaPlayer{

    @Override
    public void play(String audioType, String filename) {
        //note: i don't like this implementation.. why would you allow this? you already did it
        //in the constructor..
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
