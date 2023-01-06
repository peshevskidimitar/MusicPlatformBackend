package mk.fcse.musicplatformbackend.web.controller;

import mk.fcse.musicplatformbackend.model.PlaylistType;
import mk.fcse.musicplatformbackend.service.PlaylistTypeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/playlist-types")
@CrossOrigin
public class PlaylistTypeController {

    private final PlaylistTypeService playlistTypeService;

    public PlaylistTypeController(PlaylistTypeService playlistTypeService) {
        this.playlistTypeService = playlistTypeService;
    }

    @GetMapping("/all")
    public List<PlaylistType> getAllPlaylistTypes() {
        return playlistTypeService.findAll();
    }

}
