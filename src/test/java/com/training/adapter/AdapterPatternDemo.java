package com.training.adapter;

/**
 * Created by adame on 5/28/2017.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "We are the world.mp3");
        audioPlayer.play("mp4", "Goodbye Sky Harbor.mp4");
        audioPlayer.play("aac", "One with the underdogs.aac");
        audioPlayer.play("vlc", "Takk.vlc");
    }
}
