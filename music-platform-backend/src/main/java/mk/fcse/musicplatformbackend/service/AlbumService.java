package mk.fcse.musicplatformbackend.service;

import mk.fcse.musicplatformbackend.model.Album;

import java.util.List;

public interface AlbumService {
    List<Album> findAll();
}
