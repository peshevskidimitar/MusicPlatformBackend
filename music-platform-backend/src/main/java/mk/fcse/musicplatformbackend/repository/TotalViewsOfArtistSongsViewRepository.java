package mk.fcse.musicplatformbackend.repository;

import mk.fcse.musicplatformbackend.model.stats.TotalViewsOfArtistSongsView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TotalViewsOfArtistSongsViewRepository extends JpaRepository<TotalViewsOfArtistSongsView, Integer> {
}
