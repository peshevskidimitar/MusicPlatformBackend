package mk.fcse.musicplatformbackend.repository;

import mk.fcse.musicplatformbackend.model.stats.TotalViewsOfArtistSongsView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TotalViewsOfArtistSongsViewRepository extends JpaRepository<TotalViewsOfArtistSongsView, Integer> {
}
