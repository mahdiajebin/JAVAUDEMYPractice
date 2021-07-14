package com.company.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    private String albumName;
    private String artist;
    private  ArrayList<Song> songs;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs  = new ArrayList<Song>();

    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null) {
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
     //   for each
        for(Song checkedSong: this.songs) {
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }

        return null;
    }

    public boolean addToPlayList(int trackNumber, List<Song> playlist){
        int index = trackNumber -1;
        if((index >= 0) && (index <= this.songs.size()) ) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println(" This album does not have a track");
        return false;
    }


    public boolean addToPlayList(String title, List<Song> playList) {
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song  " + title + " is not this album");
        return false;
    }









}
