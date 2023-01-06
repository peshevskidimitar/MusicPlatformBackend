package mk.fcse.musicplatformbackend.service;

import mk.fcse.musicplatformbackend.model.PlaylistType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlaylistTypeService {
    List<PlaylistType> findAll();
}
