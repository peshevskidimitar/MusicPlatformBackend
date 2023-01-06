package mk.fcse.musicplatformbackend.repository;

import mk.fcse.musicplatformbackend.model.stats.MostPopularSongsPerYearView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MostPopularSongsPerYearViewRepository extends JpaRepository<MostPopularSongsPerYearView, Integer> {
}
