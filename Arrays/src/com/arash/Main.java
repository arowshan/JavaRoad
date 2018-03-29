package com.arash;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {


        Song song1 = new Song("desert rose", 120);
        Song song2 = new Song( "the wall", 200);
        ArrayList songs = new ArrayList<Song>();
        songs.add(song1);
        songs.add(song2);

        Album album = new Album(songs, "super album");

        LinkedList playlist = new LinkedList();

        playlist.add(album.addSong("the wall"));

        ListIterator playlistIter = playlist.listIterator();
        playlistIter.remove();
//        playlistIter.add();


        System.out.println( playlistIter.next().toString());


    }
}
