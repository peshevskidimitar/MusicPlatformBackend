package mk.fcse.musicplatformbackend.repository;

import mk.fcse.musicplatformbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
