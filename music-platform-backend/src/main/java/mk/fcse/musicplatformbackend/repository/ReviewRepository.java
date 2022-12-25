package mk.fcse.musicplatformbackend.repository;

import jakarta.transaction.Transactional;
import mk.fcse.musicplatformbackend.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
    @Modifying
    @Transactional
    @Query(value = "call insert_new_review(?1, ?2, ?3, ?4, ?5);", nativeQuery = true)
    void insertNewReview(String content,
                         LocalDate dateCreated,
                         Integer audioContentId,
                         Integer userId,
                         Integer grade);
}
