package mk.fcse.musicplatformbackend.service.impl;

import mk.fcse.musicplatformbackend.model.view.SongReviewsView;
import mk.fcse.musicplatformbackend.repository.ReviewRepository;
import mk.fcse.musicplatformbackend.repository.SongReviewsViewRepository;
import mk.fcse.musicplatformbackend.service.ReviewService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final SongReviewsViewRepository songReviewsViewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository, SongReviewsViewRepository songReviewsViewRepository) {
        this.reviewRepository = reviewRepository;
        this.songReviewsViewRepository = songReviewsViewRepository;
    }

    @Override
    public void insertNewReview(String content, LocalDate dateCreated, Integer audioContentId, Integer userId, Integer grade) {
        reviewRepository.insertNewReview(content, dateCreated, audioContentId, userId, grade);
    }

    @Override
    public List<SongReviewsView> listSongsWithReviews() {
        return songReviewsViewRepository.findAll();
    }

}
