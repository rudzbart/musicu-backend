package pl.rudz.musicuapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.rudz.musicuapp.model.Song;

@Repository
public interface SongRepo extends JpaRepository<Song, Long> {
}
