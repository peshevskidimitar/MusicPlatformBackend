package mk.fcse.musicplatformbackend.service.impl;

import mk.fcse.musicplatformbackend.model.Genre;
import mk.fcse.musicplatformbackend.repository.GenreRepository;
import mk.fcse.musicplatformbackend.service.GenreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    public GenreServiceImpl(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public List<Genre> findAll() {
        return genreRepository.findAll();
    }

}
