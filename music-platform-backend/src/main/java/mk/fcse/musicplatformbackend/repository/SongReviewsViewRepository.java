package mk.fcse.musicplatformbackend.repository;

import mk.fcse.musicplatformbackend.model.view.SongReviewsView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongReviewsViewRepository extends JpaRepository<SongReviewsView, Integer> {
}
