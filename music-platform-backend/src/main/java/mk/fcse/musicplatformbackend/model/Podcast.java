package mk.fcse.musicplatformbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
public class Podcast extends AudioContent {

    private String description;
    @ManyToMany
    @JoinTable(
            name = "music_professional_participates_in_podcast",
            joinColumns = @JoinColumn(name = "id_audio_content_podcast"),
            inverseJoinColumns = @JoinColumn(name = "id_music_professional")
    )
    @JsonIgnoreProperties(value = "podcasts")
    private List<MusicProfessional> musicProfessionals;

}
