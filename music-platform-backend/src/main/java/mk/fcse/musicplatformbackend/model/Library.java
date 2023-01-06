package mk.fcse.musicplatformbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Library {

    @Id
    @Column(name = "id_library")
    private Integer id;
    @OneToOne
    @JoinColumn(name = "id_user", nullable = false)
    @JsonIgnoreProperties(value = "library")
    private User user;
    @ManyToMany
    @JoinTable(
            name = "playlist_belongs_to_library",
            joinColumns = @JoinColumn(name = "id_library"),
            inverseJoinColumns = @JoinColumn(name = "id_playlist")
    )
    private List<Playlist> playlists;

}
