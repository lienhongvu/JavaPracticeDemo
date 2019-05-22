package com.lienhongvu.compareobject;

import java.util.*;

/**
 * Created by hvlien on 9/19/2017.
 */
public class Test {
    public static void main(String[] args) {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("That's Why", "0 Lien"));
        songs.add(new Song("Attention", "2 Lien"));
        songs.add(new Song("Attention", "1 Lien"));
        songs.add(new Song("Attention", "1 Lien"));
        Collections.sort(songs);
        System.out.println("Sort by title");
        System.out.println(songs.toString());
        // Use comparator to sort artist of song
        ArtistComparator artistComparator = new ArtistComparator();
        songs.sort(artistComparator);
        System.out.println("Sort by artist");
        System.out.println(songs.toString());
        // Using Set to remove duplicate object
        HashSet<Song> songSet = new HashSet<>(songs);
        System.out.println("Remove duplicate");
        System.out.println(songSet.toString());

        // TestGeneric object equality
        Song song3 = new Song("Attention", "1 Lien");
        Song song4 = new Song("Attention", "1 Lien");
        System.out.println(song3.equals(song4));
        System.out.println(song3.toString() + " : hashCode = " + song3.hashCode());
        System.out.println(song4.toString() + " : hashCode = " + song4.hashCode());
    }

    static class ArtistComparator implements Comparator<Song> {
        @Override
        public int compare(Song o1, Song o2) {
            return o1.getArtist().compareTo(o2.getArtist());
        }
    }
}
