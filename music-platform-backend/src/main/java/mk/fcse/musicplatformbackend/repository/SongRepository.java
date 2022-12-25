package mk.fcse.musicplatformbackend.repository;

import jakarta.transaction.Transactional;
import mk.fcse.musicplatformbackend.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {
    @Modifying
    @Transactional
    @Query(value = "call insert_new_song(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8);", nativeQuery = true)
    void insertNewSong(String title,
                       String filePath,
                       LocalDate datePublished,
                       Integer genreId,
                       String lyrics,
                       Integer albumId,
                       Integer recordLabelId,
                       Integer artistId);
    @Modifying
    @Transactional
    @Query(value = "call insert_song_into_playlist(?1, ?2);", nativeQuery = true)
    void insertSongIntoPlaylist(Integer audioContentId, Integer playlistId);
}
