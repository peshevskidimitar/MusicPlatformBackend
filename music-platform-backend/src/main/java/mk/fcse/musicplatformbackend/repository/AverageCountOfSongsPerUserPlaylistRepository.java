package mk.fcse.musicplatformbackend.repository;

import mk.fcse.musicplatformbackend.model.stats.AverageCountOfSongsPerUserPlaylistView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AverageCountOfSongsPerUserPlaylistRepository extends JpaRepository<AverageCountOfSongsPerUserPlaylistView,Integer> {
}
