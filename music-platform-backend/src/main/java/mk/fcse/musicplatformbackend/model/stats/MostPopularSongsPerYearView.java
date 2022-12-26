package mk.fcse.musicplatformbackend.model.stats;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.math.BigInteger;

@Entity
@Immutable
@Table(name = "most_popular_songs_per_year")
@Data
@NoArgsConstructor
public class MostPopularSongsPerYearView {

    @Id
    private BigInteger year;
    private Integer maxViews;
    @Column(name = "id_audio_content")
    private Integer audioContentId;
    private String title;

}
