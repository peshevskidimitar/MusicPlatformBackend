package mk.fcse.musicplatformbackend.service;

import mk.fcse.musicplatformbackend.model.stats.CountOfSongsPerGenreView;
import mk.fcse.musicplatformbackend.model.view.SongReviewsView;

import java.util.List;

public interface ReviewService {
    void insertNewReview(String content,
                         Integer audioContentId,
                         Integer userId,
                         Integer grade);
    List<SongReviewsView> listSongsWithReviews();

    List<CountOfSongsPerGenreView> listSongsByGenre();
}
