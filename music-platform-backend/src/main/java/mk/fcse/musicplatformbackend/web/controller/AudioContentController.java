package mk.fcse.musicplatformbackend.web.controller;

import mk.fcse.musicplatformbackend.model.AudioContent;
import mk.fcse.musicplatformbackend.model.stats.MonthlyReviewsAndAverageGradePerAudioContentView;
import mk.fcse.musicplatformbackend.service.AudioContentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(("/audio-contents"))
@CrossOrigin
public class AudioContentController {

    private final AudioContentService audioContentService;

    public AudioContentController(AudioContentService audioContentService) {
        this.audioContentService = audioContentService;
    }

    @GetMapping("/all")
    public List<AudioContent> getAllAudioContents() {
        return audioContentService.findAll();
    }

    @GetMapping("/reviews-stats")
    public List<MonthlyReviewsAndAverageGradePerAudioContentView> getReviewsStats() {
        return audioContentService.getReviewsStats();
    }

}
