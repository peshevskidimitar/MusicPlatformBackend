package mk.fcse.musicplatformbackend.repository;

import mk.fcse.musicplatformbackend.model.stats.CountOfSongsPerGenreView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountOfSongsPerGenreViewRepository extends JpaRepository<CountOfSongsPerGenreView,Integer> {
}
