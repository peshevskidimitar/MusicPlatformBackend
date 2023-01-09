package mk.fcse.musicplatformbackend.model.helper;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PlaylistHelper {

    private String playlistTitle;
    private List<AudioContentHelper> audioContents;

    public PlaylistHelper(String playlistTitle) {
        this.playlistTitle = playlistTitle;
        audioContents = new ArrayList<>();
    }

}
