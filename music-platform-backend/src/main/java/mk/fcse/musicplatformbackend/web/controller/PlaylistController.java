package mk.fcse.musicplatformbackend.web.controller;

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

}
