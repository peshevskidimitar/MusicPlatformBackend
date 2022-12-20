package mk.fcse.musicplatformbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor
public class AudioContent {

    @Id
    @Column(name = "id_audio_content")
    private Integer id;
    private String title;
    private LocalDate datePublished;
    private Integer views;
    private String filePath;
    @ManyToMany
    @JoinTable(
            name = "audio_content_belongs_to_playlist",
            joinColumns = @JoinColumn(name = "id_audio_content"),
            inverseJoinColumns = @JoinColumn(name = "id_playlist")
    )
    @JsonIgnoreProperties(value = "audioContents")
    private List<Playlist> playlists;

}
