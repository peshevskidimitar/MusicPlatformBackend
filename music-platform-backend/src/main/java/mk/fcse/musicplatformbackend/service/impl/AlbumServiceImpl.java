package mk.fcse.musicplatformbackend.service.impl;

import mk.fcse.musicplatformbackend.model.Album;
import mk.fcse.musicplatformbackend.repository.AlbumRepository;
import mk.fcse.musicplatformbackend.service.AlbumService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    private final AlbumRepository albumRepository;

    public AlbumServiceImpl(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> findAll() {
        return albumRepository.findAll();
    }
}
