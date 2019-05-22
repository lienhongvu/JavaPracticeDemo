package com.lienhongvu.compareobject;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by hvlien on 9/19/2017.
 */
//@Data
@AllArgsConstructor
public class Song implements Comparable<Song>{
    private String title;
    private String artist;

    @Override
    public int compareTo(Song o) {
        return this.getTitle().compareTo(o.getTitle());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Song song = (Song) o;
        return this.getTitle().equals(song.getTitle());
    }

    @Override
    public int hashCode() {
        return getTitle().hashCode();
    }
}
