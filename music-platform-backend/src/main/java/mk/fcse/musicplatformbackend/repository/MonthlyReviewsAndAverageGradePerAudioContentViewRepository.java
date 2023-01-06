package mk.fcse.musicplatformbackend.repository;

import mk.fcse.musicplatformbackend.model.stats.MonthlyReviewsAndAverageGradePerAudioContentView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthlyReviewsAndAverageGradePerAudioContentViewRepository
        extends JpaRepository<MonthlyReviewsAndAverageGradePerAudioContentView, Integer> {
}
