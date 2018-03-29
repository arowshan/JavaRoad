package com.arash;

import java.util.ArrayList;

public class Album {

    private ArrayList<Song> songs = new ArrayList<Song>();
    private String name;


    public Album(ArrayList<Song> songs, String name) {
        this.songs = songs;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public Song addSong(String songName) {
        for(int i = 0; i< songs.size(); i++ ) {
            if(songName == songs.get(i).getTitle()){
                return songs.get(i);
            }
        }
        System.out.println("Song did not exist");
        return null;
    }
}
