package com.training.adapter;

/**
 * Created by adame on 5/28/2017.
 */
public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType == null) {
            System.out.println("Missing audio type.");
        }
        else if(audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();

        }
        else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
        else {
            System.out.println("Unsupported audio type!");
        }
    }

    @Override
    public void play(String audioType, String filename) {
        //note: i don't like this implementation.. why would you allow this? you already did it
        //in the constructor..
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(filename);
        }
        else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(filename);
        }
        else {
            System.out.println("no music for you!");
        }
    }
}
