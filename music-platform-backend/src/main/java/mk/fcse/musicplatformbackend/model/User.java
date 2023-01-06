package mk.fcse.musicplatformbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="user", schema = "public")
@Data
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "id_user")
    private Integer id;
    private String username;
    private String password;
    private String name;
    private String surname;
    private String email;
    private String gender;
    private String country;
    private LocalDate dateOfBirth;

    @ManyToMany
    @JoinTable(
            name = "user_is_in_role",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_role")
    )
    @JsonIgnoreProperties(value = "users")
    private List<Role> roles;
    @OneToOne(mappedBy = "user")
    @JsonIgnoreProperties(value = {"user", "playlists"})
    private Library library;

}
