package pl.rudz.musicuapp.service;

import pl.rudz.musicuapp.model.Song;

import java.util.List;

public interface SongService {

    List<Song> getAllSongs();
    Song addSong(Song song);
    void deleteSong(Long id);
    Song updateSong(Song song, long id);
    Song getSongById(long id);
}
