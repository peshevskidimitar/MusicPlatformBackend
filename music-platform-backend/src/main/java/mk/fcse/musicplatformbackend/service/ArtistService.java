package mk.fcse.musicplatformbackend.service;

import mk.fcse.musicplatformbackend.model.Artist;

import java.util.List;

public interface ArtistService {
    List<Artist> findAll();
}
