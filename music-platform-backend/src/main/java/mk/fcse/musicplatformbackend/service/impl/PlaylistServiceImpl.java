package mk.fcse.musicplatformbackend.service.impl;

import mk.fcse.musicplatformbackend.model.Playlist;
import mk.fcse.musicplatformbackend.model.stats.AverageCountOfSongsPerUserPlaylistView;
import mk.fcse.musicplatformbackend.model.stats.CountOfSongsPerPlaylistView;
import mk.fcse.musicplatformbackend.model.view.UserPlaylistsView;
import mk.fcse.musicplatformbackend.repository.*;
import mk.fcse.musicplatformbackend.service.PlaylistService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistServiceImpl implements PlaylistService {

    private final PlaylistRepository playlistRepository;
    private final UserPlaylistsViewRepository userPlaylistsViewRepository;
    private final AverageCountOfSongsPerUserPlaylistRepository averageCountOfSongsPerUserPlaylistRepository;
    private final CountOfSongsPerPlaylistViewRepository countOfSongsPerPlaylistViewRepository;

    public PlaylistServiceImpl(PlaylistRepository playlistRepository, UserPlaylistsViewRepository userPlaylistsViewRepository, AverageCountOfSongsPerUserPlaylistRepository averageCountOfSongsPerUserPlaylistRepository, CountOfSongsPerPlaylistViewRepository countOfSongsPerPlaylistViewRepository) {
        this.playlistRepository = playlistRepository;
        this.userPlaylistsViewRepository = userPlaylistsViewRepository;
        this.averageCountOfSongsPerUserPlaylistRepository = averageCountOfSongsPerUserPlaylistRepository;
        this.countOfSongsPerPlaylistViewRepository = countOfSongsPerPlaylistViewRepository;

    }

    @Override
    public List<Playlist> findAll() {
        return playlistRepository.findAll();
    }

    @Override
    public void insertNewPlaylist(String title, Integer playlistTypeId, Integer userId) {
        playlistRepository.insertNewPlaylist(title, playlistTypeId, userId);
    }

    @Override
    public List<UserPlaylistsView> listUsersWithPlaylists() {
        return userPlaylistsViewRepository.findAll();
    }

    @Override
    public List<AverageCountOfSongsPerUserPlaylistView> getStats() {
        return averageCountOfSongsPerUserPlaylistRepository.findAll();
    }

    @Override
    public List<CountOfSongsPerPlaylistView> getCountOfSongs() {
        return countOfSongsPerPlaylistViewRepository.findAll();
    }

}
