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
@Table(name = "songs_per_genre")
@Data
@NoArgsConstructor
public class CountOfSongsPerGenreView {

    @Id
    @Column(name = "id_genre")
    private Integer genreId;
    private String name;
    private Integer count;

}
