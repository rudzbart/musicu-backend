package pl.rudz.musicuapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.rudz.musicuapp.model.Song;
import pl.rudz.musicuapp.repo.SongRepo;

import java.util.List;

@Service
public class SongServiceImplementation implements SongService {

    private SongRepo songRepo;

    @Autowired
    public SongServiceImplementation(SongRepo songRepo) {
        this.songRepo = songRepo;
    }

    @Override
    public List<Song> getAllSongs() {
        return songRepo.findAll();
    }

    @Override
    public Song addSong(Song song) {
        return songRepo.save(song);
    }

    @Override
    public void deleteSong(Long id) {
        songRepo.deleteById(id);
    }

    @Override
    public Song updateSong(Song song, long id) {
        Song songToUpdate = getSongById(id);
        songToUpdate.setArtist(song.getArtist());
        songToUpdate.setTitle(song.getTitle());
        songToUpdate.setSpotifyuri(song.getSpotifyuri());
        songRepo.save(songToUpdate);
        return songToUpdate;
    }

    @Override
    public Song getSongById(long id) {
        return songRepo.getSongById(id);
    }
}
