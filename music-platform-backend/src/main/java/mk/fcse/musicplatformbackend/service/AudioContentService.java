package mk.fcse.musicplatformbackend.service;

import mk.fcse.musicplatformbackend.model.stats.MonthlyReviewsAndAverageGradePerAudioContentView;

import java.util.List;

public interface AudioContentService {
    List<MonthlyReviewsAndAverageGradePerAudioContentView> getReviewsStats();
}
