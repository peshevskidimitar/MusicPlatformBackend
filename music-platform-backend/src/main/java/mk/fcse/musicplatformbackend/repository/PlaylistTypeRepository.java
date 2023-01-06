package mk.fcse.musicplatformbackend.repository;

import mk.fcse.musicplatformbackend.model.PlaylistType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistTypeRepository extends JpaRepository<PlaylistType, Integer> {
}
