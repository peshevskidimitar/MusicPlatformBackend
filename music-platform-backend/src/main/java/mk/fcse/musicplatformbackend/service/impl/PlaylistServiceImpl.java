package mk.fcse.musicplatformbackend.service.impl;

import mk.fcse.musicplatformbackend.model.Playlist;
import mk.fcse.musicplatformbackend.model.helper.AudioContentHelper;
import mk.fcse.musicplatformbackend.model.helper.PlaylistHelper;
import mk.fcse.musicplatformbackend.model.helper.UserPlaylistsViewHelper;
import mk.fcse.musicplatformbackend.model.stats.AverageCountOfSongsPerUserPlaylistView;
import mk.fcse.musicplatformbackend.model.stats.CountOfSongsPerPlaylistView;
import mk.fcse.musicplatformbackend.model.view.UserPlaylistsView;
import mk.fcse.musicplatformbackend.repository.*;
import mk.fcse.musicplatformbackend.service.PlaylistService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    public List<UserPlaylistsViewHelper> listUsersWithPlaylists() {
        List<UserPlaylistsViewHelper> list = new ArrayList<>();
        for (UserPlaylistsView userPlaylistsView : userPlaylistsViewRepository.findAll()) {
            UserPlaylistsViewHelper userPlaylistsViewHelper = list.stream()
                    .filter(elem -> elem.getUserUsername().equals(userPlaylistsView.getUserUsername()))
                    .findFirst()
                    .orElse(null);

            if (userPlaylistsViewHelper == null) {
                userPlaylistsViewHelper = new UserPlaylistsViewHelper(userPlaylistsView.getUserUsername());
                list.add(userPlaylistsViewHelper);
            }

            if (userPlaylistsView.getPlaylistTitle() != null) {
                PlaylistHelper playlistHelper = userPlaylistsViewHelper.getPlaylists().stream()
                        .filter(elem -> elem.getPlaylistTitle().equals(userPlaylistsView.getPlaylistTitle()))
                        .findFirst()
                        .orElse(null);

                if (playlistHelper == null) {
                    playlistHelper = new PlaylistHelper(userPlaylistsView.getPlaylistTitle());
                    userPlaylistsViewHelper.getPlaylists().add(playlistHelper);
                }

                if (userPlaylistsView.getAudioContentTitle() != null &&
                        userPlaylistsView.getAudioContentDatePublished() != null &&
                        userPlaylistsView.getGenreName() != null) {
                    AudioContentHelper audioContentHelper = new AudioContentHelper(
                            userPlaylistsView.getAudioContentTitle(),
                            userPlaylistsView.getAudioContentDatePublished(),
                            userPlaylistsView.getGenreName()
                    );

                    playlistHelper.getAudioContents().add(audioContentHelper);
                }
            }
        }

        return list;
    }

    @Override
    public List<UserPlaylistsViewHelper> listUsersWithPlaylists(String userUsername) {
        return listUsersWithPlaylists().stream()
                .filter(userPlaylistsViewHelper -> userPlaylistsViewHelper.getUserUsername().equals(userUsername))
                .collect(Collectors.toList());
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
