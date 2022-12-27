package mk.fcse.musicplatformbackend.model.view;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.time.LocalDate;

@Entity
@Table(name = "list_songs_with_reviews")
@Data
@NoArgsConstructor
@Immutable
public class SongReviewsView {

    @Id
    private Integer id;
    private String songTitle;
    private LocalDate songDatePublished;
    private String reviewContent;
    private Integer reviewGrade;
    private LocalDate reviewDateCreated;
    private String userUsername;

}
