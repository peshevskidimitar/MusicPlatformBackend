package mk.fcse.musicplatformbackend.model.helper;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class PodcastsViewHelper {

    private Integer id;
    private String podcastTitle;
    private LocalDate podcastDatePublished;
    private String podcastDescription;
    private String genreName;
    private List<MusicProfessionalHelper> musicProfessionals;

    public PodcastsViewHelper(Integer id, String podcastTitle, LocalDate podcastDatePublished, String podcastDescription, String genreName) {
        this.id = id;
        this.podcastTitle = podcastTitle;
        this.podcastDatePublished = podcastDatePublished;
        this.podcastDescription = podcastDescription;
        this.genreName = genreName;
        this.musicProfessionals = new ArrayList<>();
    }

}
