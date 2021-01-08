package pl.rudz.musicuapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.rudz.musicuapp.model.Song;
import pl.rudz.musicuapp.service.SongService;
import java.util.List;

@RestController
@RequestMapping("/musicu")
@CrossOrigin
public class SongApi {

    private SongService songService;

    @Autowired
    public SongApi(SongService songService) {
        this.songService = songService;
        Song songSong = new Song();
        songSong.setArtist("Jason Derulo");
        songSong.setTitle("essa");
        songSong.setSpotifyuri("xDDDD");
        songService.addSong(songSong);
    }

    @GetMapping
    public ResponseEntity<List<Song>> getAllSongs() {
        return new ResponseEntity<>(songService.getAllSongs(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Song> addSong(@RequestBody Song song){
        return new ResponseEntity<>(songService.addSong(song), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleteSong(@PathVariable Long id){
        songService.deleteSong(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Boolean> updateSong(@RequestBody Song song){
        boolean songCheck = songService.updateSong(song);
        if(songCheck){
            return new ResponseEntity<>(true, HttpStatus.OK);
        }
        else return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }
}
