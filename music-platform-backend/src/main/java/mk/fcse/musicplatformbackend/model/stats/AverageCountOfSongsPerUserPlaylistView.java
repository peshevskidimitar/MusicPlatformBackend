package mk.fcse.musicplatformbackend.model.stats;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;

@Entity
@Immutable
@Table(name = "average_count_of_songs_per_user_playlist")
@Data
@NoArgsConstructor
public class AverageCountOfSongsPerUserPlaylistView {

    @Id
    @Column(name = "id_user")
    private Integer userId;
    private String username;
    private BigDecimal averageCountOfSongs;

}
