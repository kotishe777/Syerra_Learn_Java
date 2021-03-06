package collections;

import java.util.Objects;

public class Song implements Comparable<Song>{
    String title;
    String artist;
    String rating;
    String btm;

    public Song(String title, String artist, String rating, String btm) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.btm = btm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBtm() {
        return btm;
    }

    public String toString(){
        return title;
    }

    public int compareTo(Song s) {
        return title.compareTo(s.title);
    }

    public boolean equals(Object aSong) {
        Song s = (Song) aSong;
        return getTitle().equals(s.getTitle());
    }

    public int hashCode() {
        return title.hashCode();
    }
}
