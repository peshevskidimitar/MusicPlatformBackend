package mk.fcse.musicplatformbackend.service.impl;

import mk.fcse.musicplatformbackend.model.PlaylistType;
import mk.fcse.musicplatformbackend.repository.PlaylistTypeRepository;
import mk.fcse.musicplatformbackend.service.PlaylistTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistTypeServiceImpl implements PlaylistTypeService {

    private final PlaylistTypeRepository playlistTypeRepository;

    public PlaylistTypeServiceImpl(PlaylistTypeRepository playlistTypeRepository) {
        this.playlistTypeRepository = playlistTypeRepository;
    }

    @Override
    public List<PlaylistType> findAll() {
        return playlistTypeRepository.findAll();
    }

}
