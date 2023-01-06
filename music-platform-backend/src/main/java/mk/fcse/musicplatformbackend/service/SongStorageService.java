package mk.fcse.musicplatformbackend.service;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface SongStorageService {
    public void init();
    void save(MultipartFile file, String title);
    public Resource load(String filename);
    public void deleteAll();
    public Stream<Path> loadAll();
}