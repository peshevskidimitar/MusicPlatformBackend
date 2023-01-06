package mk.fcse.musicplatformbackend.web.controller;

import mk.fcse.musicplatformbackend.model.Artist;
import mk.fcse.musicplatformbackend.service.ArtistService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/artists")
@CrossOrigin
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/all")
    public List<Artist> getAllArtists() {
        return artistService.findAll();
    }

}
