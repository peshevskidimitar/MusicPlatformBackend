package mk.fcse.musicplatformbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Playlist {

    @Id
    @Column(name = "id_playlist")
    private Integer id;
    private String title;
    @ManyToOne
    @JoinColumn(name = "id_playlist_type", nullable = false)
    private PlaylistType playlistType;
    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;
    @ManyToMany(mappedBy = "playlists")
    @JsonIgnoreProperties(value = "playlists")
    private List<Library> libraries;
    @ManyToMany(mappedBy = "playlists")
    private List<AudioContent> audioContents;

}
