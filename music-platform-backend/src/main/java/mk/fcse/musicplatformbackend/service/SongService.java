package mk.fcse.musicplatformbackend.service;

import mk.fcse.musicplatformbackend.model.view.SongsView;

import java.time.LocalDate;
import java.util.List;

public interface SongService {
    void insertNewSong(String title,
                       String filePath,
                       LocalDate datePublished,
                       Integer genreId,
                       String lyrics,
                       Integer albumId,
                       Integer recordLabelId,
                       Integer artistId);
    void insertSongIntoPlaylist(Integer audioContentId, Integer playlistId);
    List<SongsView> listSongs();
}
