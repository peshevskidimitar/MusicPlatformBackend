package mk.fcse.musicplatformbackend.service;

import mk.fcse.musicplatformbackend.model.AudioContent;
import mk.fcse.musicplatformbackend.model.stats.MonthlyReviewsAndAverageGradePerAudioContentView;

import java.util.List;

public interface AudioContentService {
    List<AudioContent> findAll();
    List<MonthlyReviewsAndAverageGradePerAudioContentView> getReviewsStats();
}
