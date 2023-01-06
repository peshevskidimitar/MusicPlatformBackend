package mk.fcse.musicplatformbackend.service.impl;

import mk.fcse.musicplatformbackend.model.Artist;
import mk.fcse.musicplatformbackend.repository.ArtistRepository;
import mk.fcse.musicplatformbackend.service.ArtistService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Artist> findAll() {
        return artistRepository.findAll();
    }

}
