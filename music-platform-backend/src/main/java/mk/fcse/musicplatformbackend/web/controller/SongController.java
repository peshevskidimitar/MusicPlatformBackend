package mk.fcse.musicplatformbackend.web.controller;

import mk.fcse.musicplatformbackend.service.SongService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/songs")
public class SongController {

    private final SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    @PostMapping("/add")
    public void insertNewSong(@RequestParam String title,
                              @RequestParam String filePath,
                              @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate datePublished,
                              @RequestParam Integer genreId,
                              @RequestParam String lyrics,
                              @RequestParam Integer albumId,
                              @RequestParam Integer recordLabelId,
                              @RequestParam Integer artistId) {
        songService.insertNewSong(title, filePath, datePublished, genreId, lyrics, albumId, recordLabelId, artistId);
    }

    @PostMapping("/add-to-playlist")
    public void insertSongIntoPlaylist(@RequestParam Integer audioContentId,
                                       @RequestParam Integer playlistId) {
        songService.insertSongIntoPlaylist(audioContentId, playlistId);
    }

}
