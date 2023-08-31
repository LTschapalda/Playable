package org.example;

public class Main {
    public static void main(String[] args) {
        //Objecte der Klassen MusicPlayer und Videoplayer erstellen
        MusicPlayer musicPlayer = new MusicPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();

        Playable cdPlayer = new MusicPlayer();
        Playable vhsPlayer = new VideoPlayer();

        //Object der Klasse MediaController erstellen
        MediaController fernbedienung = new MediaController();
        //abspielen von sowohl Song als auch Video
        System.out.println("Abspielen per Fernbedienung");
        fernbedienung.playMedia(musicPlayer);
        fernbedienung.playMedia(videoPlayer);

        System.out.println("Abspielen direkt auf den Geräten");
        //abspielen von Songs oder Video auf jeweiligem Gerät
        cdPlayer.play();
        vhsPlayer.play();

    }
}