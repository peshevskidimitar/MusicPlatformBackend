package mk.fcse.musicplatformbackend.repository;

import mk.fcse.musicplatformbackend.model.view.UserPlaylistsView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPlaylistsViewRepository extends JpaRepository<UserPlaylistsView, Integer> {
}
