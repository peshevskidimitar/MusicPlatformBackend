package mk.fcse.musicplatformbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Artist {

    @Id
    @Column(name = "id_artist")
    private Integer id;
    private String fullName;
    private String country;
    @ManyToMany(mappedBy = "artists")
    @JsonIgnoreProperties(value = "artists")
    private List<Song> songs;
    @ManyToMany(mappedBy = "artists")
    @JsonIgnoreProperties(value = "artists")
    private List<Album> albums;

}
