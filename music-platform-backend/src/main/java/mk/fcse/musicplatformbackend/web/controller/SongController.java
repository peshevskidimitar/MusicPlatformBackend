package mk.fcse.musicplatformbackend.web.controller;

import mk.fcse.musicplatformbackend.model.stats.CountOfSongsPerGenreView;
import mk.fcse.musicplatformbackend.model.stats.MostPopularSongsPerYearView;
import mk.fcse.musicplatformbackend.model.stats.TotalViewsOfArtistSongsView;
import mk.fcse.musicplatformbackend.model.view.SongReviewsView;
import mk.fcse.musicplatformbackend.model.view.SongsView;
import mk.fcse.musicplatformbackend.service.ReviewService;
import mk.fcse.musicplatformbackend.service.SongService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/songs")
@CrossOrigin
public class SongController {

    private final SongService songService;
    private final ReviewService reviewService;

    public SongController(SongService songService, ReviewService reviewService) {
        this.songService = songService;
        this.reviewService = reviewService;
    }

    @GetMapping("/all")
    public List<SongsView> getAllSongs() {
        return songService.listSongs();
    }

    @GetMapping("/reviews")
    public List<SongReviewsView> getAllSongReviews() {
        return reviewService.listSongsWithReviews();
    }

    @GetMapping("/byGenre")
    public List<CountOfSongsPerGenreView> getSongsByGenre() {
        return reviewService.listSongsByGenre();
    }

    @GetMapping("/most-popular")
    public List<MostPopularSongsPerYearView> getMostPopularSongsPerYear() {
        return songService.mostPopularSongsPerYear();
    }

    @GetMapping("/total-views")
    public List<TotalViewsOfArtistSongsView> getTotalViewsOfArtistSongs() {
        return songService.totalViewsOfAritstSongs();
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
