package mk.fcse.musicplatformbackend.repository;

import jakarta.transaction.Transactional;
import mk.fcse.musicplatformbackend.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {
    @Modifying
    @Transactional
    @Query(value = "call insert_new_playlist(?1, ?2, ?3);", nativeQuery = true)
    void insertNewPlaylist(String title,
                           Integer playlistTypeId,
                           Integer userId);
}
