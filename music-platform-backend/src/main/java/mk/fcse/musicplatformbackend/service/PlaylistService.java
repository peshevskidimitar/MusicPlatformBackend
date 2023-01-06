package mk.fcse.musicplatformbackend.service;

import mk.fcse.musicplatformbackend.model.Playlist;
import mk.fcse.musicplatformbackend.model.stats.AverageCountOfSongsPerUserPlaylistView;
import mk.fcse.musicplatformbackend.model.stats.CountOfSongsPerPlaylistView;
import mk.fcse.musicplatformbackend.model.view.UserPlaylistsView;

import java.util.List;

public interface PlaylistService {
    List<Playlist> findAll();
    void insertNewPlaylist(String title, Integer playlistTypeId, Integer userId);
    List<UserPlaylistsView> listUsersWithPlaylists();

    List<AverageCountOfSongsPerUserPlaylistView> getStats();

    List<CountOfSongsPerPlaylistView> getCountOfSongs();
}
