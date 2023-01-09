package mk.fcse.musicplatformbackend.service.impl;

import mk.fcse.musicplatformbackend.model.AudioContent;
import mk.fcse.musicplatformbackend.model.stats.MonthlyReviewsAndAverageGradePerAudioContentView;
import mk.fcse.musicplatformbackend.repository.AudioContentRepository;
import mk.fcse.musicplatformbackend.repository.MonthlyReviewsAndAverageGradePerAudioContentViewRepository;
import mk.fcse.musicplatformbackend.service.AudioContentService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AudioContentServiceImpl implements AudioContentService {

    private final AudioContentRepository audioContentRepository;
    private final MonthlyReviewsAndAverageGradePerAudioContentViewRepository monthlyReviewsAndAverageGradePerAudioContentViewRepository;

    public AudioContentServiceImpl(AudioContentRepository audioContentRepository,
                                   MonthlyReviewsAndAverageGradePerAudioContentViewRepository monthlyReviewsAndAverageGradePerAudioContentViewRepository) {
        this.audioContentRepository = audioContentRepository;
        this.monthlyReviewsAndAverageGradePerAudioContentViewRepository = monthlyReviewsAndAverageGradePerAudioContentViewRepository;
    }

    @Override
    public List<AudioContent> findAll() {
        return audioContentRepository.findAll();
    }

    @Override
    public List<MonthlyReviewsAndAverageGradePerAudioContentView> getReviewsStats() {
        return monthlyReviewsAndAverageGradePerAudioContentViewRepository.findAll().stream()
                .sorted(Comparator.comparing(MonthlyReviewsAndAverageGradePerAudioContentView::getYear)
                        .thenComparing(MonthlyReviewsAndAverageGradePerAudioContentView::getMonth))
                .collect(Collectors.toList());
    }

}
