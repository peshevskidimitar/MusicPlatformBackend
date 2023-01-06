package mk.fcse.musicplatformbackend.repository;

import mk.fcse.musicplatformbackend.model.RecordLabel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordLabelRepository extends JpaRepository<RecordLabel, Integer> {
}
