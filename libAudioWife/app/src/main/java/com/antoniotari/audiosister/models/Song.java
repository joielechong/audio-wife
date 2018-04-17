package com.antoniotari.audiosister.models;

import android.graphics.Bitmap;

public class Song {
    private String artist;
    private String album;
    private String title;
    private Bitmap art;

    public Song(String artist, String album, String title, Bitmap art) {
        this.artist = artist;
        this.album = album;
        this.title = title;
        this.art = art;
    }

    public Song(String artist, String album, String title) {
        this.artist = artist;
        this.album = album;
        this.title = title;
    }

    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getTitle() {
        return title;
    }

    public Bitmap getArt() {
        return art;
    }

    public void setArt(Bitmap art) {
        this.art = art;
    }
}
