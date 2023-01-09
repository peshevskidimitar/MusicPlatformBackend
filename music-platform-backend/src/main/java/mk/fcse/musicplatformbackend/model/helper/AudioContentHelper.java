package mk.fcse.musicplatformbackend.model.helper;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AudioContentHelper {

    private String audioContentTitle;
    private LocalDate audioContentDatePublished;
    private String genreName;

    public AudioContentHelper(String audioContentTitle, LocalDate audioContentDatePublished, String genreName) {
        this.audioContentTitle = audioContentTitle;
        this.audioContentDatePublished = audioContentDatePublished;
        this.genreName = genreName;
    }

}
