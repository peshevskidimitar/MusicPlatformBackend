package mk.fcse.musicplatformbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class RecordLabel {

    @Id
    @Column(name = "id_record_label")
    private Integer id;
    private String name;
    @ManyToMany(mappedBy = "recordLabels")
    @JsonIgnoreProperties(value = "recordLabels")
    private List<MusicProfessional> musicProfessionals;
}
