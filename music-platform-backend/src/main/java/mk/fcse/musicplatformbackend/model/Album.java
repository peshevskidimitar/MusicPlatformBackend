package mk.fcse.musicplatformbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Album {

    @Id
    @Column(name = "id_album")
    private Integer id;
    private String title;
    private String coverFilePath;
    @ManyToMany
    @JoinTable(
            name = "artist_owns_album",
            joinColumns = @JoinColumn(name = "id_album"),
            inverseJoinColumns = @JoinColumn(name = "id_artist")
    )
    @JsonIgnoreProperties(value = "albums")
    private List<Artist> artists;

}
