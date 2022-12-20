package mk.fcse.musicplatformbackend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class PlaylistType {

    @Id
    @Column(name = "id_playlist_type")
    private Integer id;
    private String type;

}
