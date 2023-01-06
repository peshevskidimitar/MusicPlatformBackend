package mk.fcse.musicplatformbackend.service.impl;

import mk.fcse.musicplatformbackend.model.stats.CountOfSongsPerGenreView;
import mk.fcse.musicplatformbackend.model.view.SongReviewsView;
import mk.fcse.musicplatformbackend.repository.CountOfSongsPerGenreViewRepository;
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
    private final CountOfSongsPerGenreViewRepository countOfSongsPerGenreViewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository, SongReviewsViewRepository songReviewsViewRepository, CountOfSongsPerGenreViewRepository countOfSongsPerGenreViewRepository) {
        this.reviewRepository = reviewRepository;
        this.songReviewsViewRepository = songReviewsViewRepository;
        this.countOfSongsPerGenreViewRepository = countOfSongsPerGenreViewRepository;
    }

    @Override
    public void insertNewReview(String content, Integer audioContentId, Integer userId, Integer grade) {
        reviewRepository.insertNewReview(content, LocalDate.now(), audioContentId, userId, grade);
    }

    @Override
    public List<SongReviewsView> listSongsWithReviews() {
        return songReviewsViewRepository.findAll();
    }

    @Override
    public List<CountOfSongsPerGenreView> listSongsByGenre() {
        return countOfSongsPerGenreViewRepository.findAll();
    }

}
