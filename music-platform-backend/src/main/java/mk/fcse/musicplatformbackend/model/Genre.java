package mk.fcse.musicplatformbackend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Genre {

    @Id
    @Column(name = "id_genre")
    private Integer id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "id_upper_genre")
    private Genre upperGenre;

}
