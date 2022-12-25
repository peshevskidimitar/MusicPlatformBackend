package mk.fcse.musicplatformbackend.model.view;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "list_users_with_playlists")
@Data
@NoArgsConstructor
public class UserPlaylistsView {

    @Id
    private Integer id;
    private String userUsername;
    private String playlistTitle;
    private String audioContentTitle;
    private LocalDate audioContentDatePublished;
    private String genreName;

}
