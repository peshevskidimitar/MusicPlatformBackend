package mk.fcse.musicplatformbackend;

import jakarta.annotation.Resource;
import mk.fcse.musicplatformbackend.service.SongStorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicPlatformBackendApplication implements CommandLineRunner {

    @Resource
    SongStorageService songStorageService;

    public static void main(String[] args) {
        SpringApplication.run(MusicPlatformBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        songStorageService.init();
    }

}
