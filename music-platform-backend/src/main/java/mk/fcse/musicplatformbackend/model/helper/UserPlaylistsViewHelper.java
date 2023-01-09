package mk.fcse.musicplatformbackend.model.helper;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserPlaylistsViewHelper {

    private String userUsername;
    private List<PlaylistHelper> playlists;

    public UserPlaylistsViewHelper(String userUsername) {
        this.userUsername = userUsername;
        playlists = new ArrayList<>();
    }

}
