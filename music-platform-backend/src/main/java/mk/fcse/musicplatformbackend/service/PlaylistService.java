package mk.fcse.musicplatformbackend.service;

import mk.fcse.musicplatformbackend.model.view.UserPlaylistsView;

import java.util.List;

public interface PlaylistService {
    void insertNewPlaylist(String title, Integer playlistTypeId, Integer userId);
    List<UserPlaylistsView> listUsersWithPlaylists();
}
