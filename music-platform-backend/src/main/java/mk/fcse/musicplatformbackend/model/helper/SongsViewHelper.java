package mk.fcse.musicplatformbackend.model.helper;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class SongsViewHelper {

    private Integer id;
    private String songTitle;
    private LocalDate songDatePublished;
    private Integer songViews;
    private String genreName;
    private String artistFullName;
    private String artistCountry;
    private String albumTitle;
    private String recordLabelName;
    private List<MusicProfessionalHelper> musicProfessionals;

    public SongsViewHelper(Integer id, String songTitle, LocalDate songDatePublished, Integer songViews, String genreName, String artistFullName, String artistCountry, String albumTitle, String recordLabelName) {
        this.id = id;
        this.songTitle = songTitle;
        this.songDatePublished = songDatePublished;
        this.songViews = songViews;
        this.genreName = genreName;
        this.artistFullName = artistFullName;
        this.artistCountry = artistCountry;
        this.albumTitle = albumTitle;
        this.recordLabelName = recordLabelName;
        this.musicProfessionals = new ArrayList<>();
    }

}
