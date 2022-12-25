package mk.fcse.musicplatformbackend.repository;

import mk.fcse.musicplatformbackend.model.view.PodcastsView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodcastsViewRepository extends JpaRepository<PodcastsView, Integer> {
}
