package mk.fcse.musicplatformbackend.web.controller;

import mk.fcse.musicplatformbackend.service.PlaylistService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/playlists")
@CrossOrigin
public class PlaylistController {

    private final PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @PostMapping("/add")
    public void insertNewPlaylist(@RequestParam String title,
                                  @RequestParam Integer playlistTypeId,
                                  @RequestParam Integer userId) {
        playlistService.insertNewPlaylist(title, playlistTypeId, userId);
    }

}
