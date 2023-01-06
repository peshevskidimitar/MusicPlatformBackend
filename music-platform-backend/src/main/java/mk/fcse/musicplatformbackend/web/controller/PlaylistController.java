package mk.fcse.musicplatformbackend.web.controller;

import mk.fcse.musicplatformbackend.model.Playlist;
import mk.fcse.musicplatformbackend.model.stats.AverageCountOfSongsPerUserPlaylistView;
import mk.fcse.musicplatformbackend.model.stats.CountOfSongsPerPlaylistView;
import mk.fcse.musicplatformbackend.model.view.UserPlaylistsView;
import mk.fcse.musicplatformbackend.service.PlaylistService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlists")
@CrossOrigin
public class PlaylistController {

    private final PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @GetMapping
    public List<Playlist> getAllPlaylists() {
        return playlistService.findAll();
    }

    @GetMapping("/all")
    public List<UserPlaylistsView> getAllUserPlaylists() {
        return playlistService.listUsersWithPlaylists();
    }

    @PostMapping("/add")
    public void insertNewPlaylist(@RequestParam String title,
                                  @RequestParam Integer playlistTypeId,
                                  @RequestParam Integer userId) {
        playlistService.insertNewPlaylist(title, playlistTypeId, userId);
    }

    @GetMapping("/stats")
    public List<AverageCountOfSongsPerUserPlaylistView> getAllStats(){
        return playlistService.getStats();
    }

    @GetMapping("/getCountSongs")
    public List<CountOfSongsPerPlaylistView> getCountOfSongs(){
        return playlistService.getCountOfSongs();
    }
}
