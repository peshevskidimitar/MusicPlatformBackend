package mk.fcse.musicplatformbackend.repository;

import mk.fcse.musicplatformbackend.model.stats.CountOfSongsPerPlaylistView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountOfSongsPerPlaylistViewRepository extends JpaRepository<CountOfSongsPerPlaylistView,Integer> {
}
