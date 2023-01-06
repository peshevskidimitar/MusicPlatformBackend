package mk.fcse.musicplatformbackend.repository;

import mk.fcse.musicplatformbackend.model.AudioContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudioContentRepository extends JpaRepository<AudioContent, Integer> {
}
