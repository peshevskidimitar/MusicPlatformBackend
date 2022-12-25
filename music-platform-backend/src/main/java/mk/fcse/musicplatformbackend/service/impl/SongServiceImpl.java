package mk.fcse.musicplatformbackend.service.impl;

import mk.fcse.musicplatformbackend.model.view.SongsView;
import mk.fcse.musicplatformbackend.repository.SongRepository;
import mk.fcse.musicplatformbackend.repository.SongsViewRepository;
import mk.fcse.musicplatformbackend.service.SongService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    private final SongRepository songRepository;
    private final SongsViewRepository songsViewRepository;

    public SongServiceImpl(SongRepository songRepository, SongsViewRepository songsViewRepository) {
        this.songRepository = songRepository;
        this.songsViewRepository = songsViewRepository;
    }

    @Override
    public void insertNewSong(String title, String filePath, LocalDate datePublished, Integer genreId, String lyrics, Integer albumId, Integer recordLabelId, Integer artistId) {
        songRepository.insertNewSong(title, filePath, datePublished, genreId, lyrics, albumId, recordLabelId, artistId);
    }

    @Override
    public void insertSongIntoPlaylist(Integer audioContentId, Integer playlistId) {
        songRepository.insertSongIntoPlaylist(audioContentId, playlistId);
    }

    @Override
    public List<SongsView> listSongs() {
        return songsViewRepository.findAll();
    }

}
