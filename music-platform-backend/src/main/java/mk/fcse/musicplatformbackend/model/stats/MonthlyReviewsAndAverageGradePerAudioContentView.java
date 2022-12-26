package mk.fcse.musicplatformbackend.model.stats;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Immutable
@Table(name = "monthly_reviews_and_average_grade_per_audio_content")
@Data
@NoArgsConstructor
public class MonthlyReviewsAndAverageGradePerAudioContentView {

    @Id
    @Column(name = "id_audio_content")
    private Integer audioContentId;
    private String title;
    private BigInteger month;
    private Integer totalReviews;
    private BigDecimal averageGrade;

}
