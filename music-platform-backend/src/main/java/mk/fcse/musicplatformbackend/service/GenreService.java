package mk.fcse.musicplatformbackend.service;

import mk.fcse.musicplatformbackend.model.Genre;

import java.util.List;

public interface GenreService {
    List<Genre> findAll();
}
