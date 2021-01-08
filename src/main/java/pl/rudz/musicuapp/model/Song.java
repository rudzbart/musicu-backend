package pl.rudz.musicuapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    long id;
    String artist;
    String title;
    String spotifyuri;

    public Song() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSpotifyuri() {
        return spotifyuri;
    }

    public void setSpotifyuri(String spotifyuri) {
        this.spotifyuri = spotifyuri;
    }
}
