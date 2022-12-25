package mk.fcse.musicplatformbackend.service;

import mk.fcse.musicplatformbackend.model.view.SongReviewsView;

import java.time.LocalDate;
import java.util.List;

public interface ReviewService {
    void insertNewReview(String content,
                         LocalDate dateCreated,
                         Integer audioContentId,
                         Integer userId,
                         Integer grade);
    List<SongReviewsView> listSongsWithReviews();
}
