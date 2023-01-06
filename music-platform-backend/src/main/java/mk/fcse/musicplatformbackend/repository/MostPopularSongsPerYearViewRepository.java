package mk.fcse.musicplatformbackend.repository;

import mk.fcse.musicplatformbackend.model.stats.MostPopularSongsPerYearView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MostPopularSongsPerYearViewRepository extends JpaRepository<MostPopularSongsPerYearView, Integer> {
}
