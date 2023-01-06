package mk.fcse.musicplatformbackend.repository;

import mk.fcse.musicplatformbackend.model.PlaylistType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistTypeRepository extends JpaRepository<PlaylistType, Integer> {
}
