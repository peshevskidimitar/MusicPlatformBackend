package mk.fcse.musicplatformbackend.web.controller;

import mk.fcse.musicplatformbackend.model.Album;
import mk.fcse.musicplatformbackend.service.AlbumService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/albums")
@CrossOrigin
public class AlbumController {

    private final AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/all")
    public List<Album> getAllAlbums() {
        return albumService.findAll();
    }

}
