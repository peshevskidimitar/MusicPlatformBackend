package mk.fcse.musicplatformbackend.model.view;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.time.LocalDate;

@Entity
@Table(name = "list_podcasts")
@Data
@NoArgsConstructor
@Immutable
public class PodcastsView {

    @Id
    private Integer id;
    private String podcastTitle;
    private LocalDate podcastDatePublished;
    private String podcastDescription;
    private String genreName;
    private String musicProfessionalName;
    private String musicProfessionalSurname;
    private String musicProfessionalProfession;

}
