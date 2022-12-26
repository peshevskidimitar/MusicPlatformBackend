package mk.fcse.musicplatformbackend.model.stats;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "total_views_of_artist_songs")
@Data
@NoArgsConstructor
public class TotalViewsOfArtistSongsView {

    @Id
    @Column(name = "id_artist")
    private Integer artistId;
    private String fullName;
    private Integer totalViews;

}
