package mk.fcse.musicplatformbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
public class Song extends AudioContent {

    private String lyrics;
    @ManyToMany
    @JoinTable(
            name = "artist_features_song",
            joinColumns = @JoinColumn(name = "id_audio_content_song"),
            inverseJoinColumns = @JoinColumn(name = "id_artist")
    )
    @JsonIgnoreProperties(value = "songs")
    private List<Artist> artists;
    @ManyToOne
    @JoinColumn(name = "id_album")
    private Album album;
    @ManyToOne
    @JoinColumn(name = "id_record_label", nullable = false)
    private RecordLabel recordLabel;
}
