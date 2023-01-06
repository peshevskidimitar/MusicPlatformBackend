package mk.fcse.musicplatformbackend.service;

import mk.fcse.musicplatformbackend.model.Song;
import mk.fcse.musicplatformbackend.model.helper.SongsViewHelper;
import mk.fcse.musicplatformbackend.model.stats.MostPopularSongsPerYearView;
import mk.fcse.musicplatformbackend.model.stats.TotalViewsOfArtistSongsView;
import mk.fcse.musicplatformbackend.model.view.SongsView;

import java.time.LocalDate;
import java.util.List;

public interface SongService {
    List<Song> findAll();
    void insertNewSong(String title,
                       LocalDate datePublished,
                       Integer genreId,
                       String lyrics,
                       Integer albumId,
                       Integer recordLabelId,
                       Integer artistId);
    void insertSongIntoPlaylist(Integer audioContentId, Integer playlistId);
    List<SongsView> listSongs();
    List<SongsViewHelper> listSongHelpers();
    List<MostPopularSongsPerYearView> mostPopularSongsPerYear();
    List<TotalViewsOfArtistSongsView> totalViewsOfArtistSongs();
}
