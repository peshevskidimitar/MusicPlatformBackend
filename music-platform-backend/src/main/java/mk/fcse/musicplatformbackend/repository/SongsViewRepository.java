package mk.fcse.musicplatformbackend.repository;

import mk.fcse.musicplatformbackend.model.view.SongsView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongsViewRepository extends JpaRepository<SongsView, Integer> {
}
