package mk.fcse.musicplatformbackend.model.view;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.time.LocalDate;

@Entity
@Table(name = "list_songs")
@Data
@NoArgsConstructor
@Immutable
public class SongsView {

    @Id
    private Integer id;
    private String songTitle;
    private LocalDate songDatePublished;
    private Integer songViews;
    private String genreName;
    private String artistFullName;
    private String artistCountry;
    private String albumTitle;
    private String recordLabelName;
    private String musicProfessionalName;
    private String musicProfessionalSurname;
    private String musicProfessionalProfession;

}
