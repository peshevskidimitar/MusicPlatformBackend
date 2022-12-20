package mk.fcse.musicplatformbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class MusicProfessional {

    @Id
    @Column(name = "id_music_professional")
    private Integer id;
    private String name;
    private String surname;
    private String profession;
    @ManyToMany(mappedBy = "musicProfessionals")
    @JsonIgnoreProperties(value = "musicProfessionals")
    private List<Podcast> podcasts;
    @ManyToMany
    @JoinTable(
            name = "music_professional_participates_in_record_label",
            joinColumns = @JoinColumn(name = "id_music_professional"),
            inverseJoinColumns = @JoinColumn(name = "id_record_label")
    )
    @JsonIgnoreProperties(value = "musicProfessionals")
    private List<RecordLabel> recordLabels;

}
