package mk.fcse.musicplatformbackend.repository;

import mk.fcse.musicplatformbackend.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {
}
