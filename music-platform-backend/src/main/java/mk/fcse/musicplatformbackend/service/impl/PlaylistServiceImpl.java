package mk.fcse.musicplatformbackend.service.impl;

import mk.fcse.musicplatformbackend.model.view.UserPlaylistsView;
import mk.fcse.musicplatformbackend.repository.PlaylistRepository;
import mk.fcse.musicplatformbackend.repository.UserPlaylistsViewRepository;
import mk.fcse.musicplatformbackend.service.PlaylistService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistServiceImpl implements PlaylistService {

    private final PlaylistRepository playlistRepository;
    private final UserPlaylistsViewRepository userPlaylistsViewRepository;

    public PlaylistServiceImpl(PlaylistRepository playlistRepository, UserPlaylistsViewRepository userPlaylistsViewRepository) {
        this.playlistRepository = playlistRepository;
        this.userPlaylistsViewRepository = userPlaylistsViewRepository;
    }

    @Override
    public void insertNewPlaylist(String title, Integer playlistTypeId, Integer userId) {
        playlistRepository.insertNewPlaylist(title, playlistTypeId, userId);
    }

    @Override
    public List<UserPlaylistsView> listUsersWithPlaylists() {
        return userPlaylistsViewRepository.findAll();
    }

}
