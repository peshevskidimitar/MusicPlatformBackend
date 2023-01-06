package mk.fcse.musicplatformbackend.service.impl;

import mk.fcse.musicplatformbackend.model.Song;
import mk.fcse.musicplatformbackend.model.helper.MusicProfessionalHelper;
import mk.fcse.musicplatformbackend.model.helper.SongsViewHelper;
import mk.fcse.musicplatformbackend.model.stats.MostPopularSongsPerYearView;
import mk.fcse.musicplatformbackend.model.stats.TotalViewsOfArtistSongsView;
import mk.fcse.musicplatformbackend.model.view.SongsView;
import mk.fcse.musicplatformbackend.repository.MostPopularSongsPerYearViewRepository;
import mk.fcse.musicplatformbackend.repository.SongRepository;
import mk.fcse.musicplatformbackend.repository.SongsViewRepository;
import mk.fcse.musicplatformbackend.repository.TotalViewsOfArtistSongsViewRepository;
import mk.fcse.musicplatformbackend.service.SongService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    private final SongRepository songRepository;
    private final SongsViewRepository songsViewRepository;
    private final MostPopularSongsPerYearViewRepository mostPopularSongsPerYearViewRepository;
    private final TotalViewsOfArtistSongsViewRepository totalViewsOfArtistSongsViewRepository;

    public SongServiceImpl(SongRepository songRepository, SongsViewRepository songsViewRepository,
                           MostPopularSongsPerYearViewRepository mostPopularSongsPerYearViewRepository,
                           TotalViewsOfArtistSongsViewRepository totalViewsOfArtistSongsViewRepository) {
        this.songRepository = songRepository;
        this.songsViewRepository = songsViewRepository;
        this.mostPopularSongsPerYearViewRepository = mostPopularSongsPerYearViewRepository;
        this.totalViewsOfArtistSongsViewRepository = totalViewsOfArtistSongsViewRepository;
    }

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public void insertNewSong(String title, LocalDate datePublished, Integer genreId, String lyrics, Integer albumId, Integer recordLabelId, Integer artistId) {
        songRepository.insertNewSong(title, "/songs", datePublished, genreId, lyrics, albumId, recordLabelId, artistId);
    }

    @Override
    public void insertSongIntoPlaylist(Integer audioContentId, Integer playlistId) {
        songRepository.insertSongIntoPlaylist(audioContentId, playlistId);
    }

    @Override
    public List<SongsView> listSongs() {
        return songsViewRepository.findAll();
    }

    @Override
    public List<SongsViewHelper> listSongHelpers() {
        List<SongsViewHelper> list = new ArrayList<>();
        for (SongsView songsView : songsViewRepository.findAll()) {
            SongsViewHelper songsViewHelper = list.stream()
                    .filter(element -> element.getSongTitle().equals(songsView.getSongTitle()))
                    .findFirst()
                    .orElse(null);

            if (songsViewHelper == null) {
                songsViewHelper = new SongsViewHelper(
                        songsView.getId(),
                        songsView.getSongTitle(),
                        songsView.getSongDatePublished(),
                        songsView.getSongViews(),
                        songsView.getGenreName(),
                        songsView.getArtistFullName(),
                        songsView.getArtistCountry(),
                        songsView.getAlbumTitle(),
                        songsView.getRecordLabelName()
                );

                list.add(songsViewHelper);
            }

            if (songsView.getMusicProfessionalName() != null
                    && songsView.getMusicProfessionalSurname() != null
                    && songsView.getMusicProfessionalProfession() != null) {
                songsViewHelper.getMusicProfessionals().add(new MusicProfessionalHelper(
                        songsView.getMusicProfessionalName(),
                        songsView.getMusicProfessionalSurname(),
                        songsView.getMusicProfessionalProfession()
                ));
            }
        }

        return list;
    }

    @Override
    public List<MostPopularSongsPerYearView> mostPopularSongsPerYear() {
        return mostPopularSongsPerYearViewRepository.findAll();
    }

    @Override
    public List<TotalViewsOfArtistSongsView> totalViewsOfArtistSongs() {
        return totalViewsOfArtistSongsViewRepository.findAll();
    }

}
