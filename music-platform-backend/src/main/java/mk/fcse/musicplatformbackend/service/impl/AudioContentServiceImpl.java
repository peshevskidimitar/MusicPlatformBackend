package mk.fcse.musicplatformbackend.service.impl;

import mk.fcse.musicplatformbackend.model.stats.MonthlyReviewsAndAverageGradePerAudioContentView;
import mk.fcse.musicplatformbackend.repository.MonthlyReviewsAndAverageGradePerAudioContentViewRepository;
import mk.fcse.musicplatformbackend.service.AudioContentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AudioContentServiceImpl implements AudioContentService {

    private final MonthlyReviewsAndAverageGradePerAudioContentViewRepository monthlyReviewsAndAverageGradePerAudioContentViewRepository;

    public AudioContentServiceImpl(MonthlyReviewsAndAverageGradePerAudioContentViewRepository monthlyReviewsAndAverageGradePerAudioContentViewRepository) {
        this.monthlyReviewsAndAverageGradePerAudioContentViewRepository = monthlyReviewsAndAverageGradePerAudioContentViewRepository;
    }

    @Override
    public List<MonthlyReviewsAndAverageGradePerAudioContentView> getReviewsStats() {
        return monthlyReviewsAndAverageGradePerAudioContentViewRepository.findAll();
    }

}
