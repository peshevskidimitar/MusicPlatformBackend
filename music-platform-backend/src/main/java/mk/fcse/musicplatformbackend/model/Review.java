package mk.fcse.musicplatformbackend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Review {

    @Id
    @Column(name = "id_review")
    private Integer id;
    private String content;
    private LocalDate dateCreated;
    private Integer grade;
    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "id_audio_content", nullable = false)
    private AudioContent audioContent;

}
