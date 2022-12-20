package mk.fcse.musicplatformbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Role {

    @Id
    @Column(name = "id_role")
    private Integer id;
    private String name;
    @ManyToMany(mappedBy = "roles")
    @JsonIgnoreProperties(value = "roles")
    private List<User> users;

}
