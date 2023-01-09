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
@Table(name = "count_of_songs_per_playlist")
@Data
@NoArgsConstructor
public class CountOfSongsPerPlaylistView {

    @Id
    @Column(name = "id_playlist")
    private Integer playlistId;
    private String username;
    private String title;
    private Integer countOfSongs;

}
