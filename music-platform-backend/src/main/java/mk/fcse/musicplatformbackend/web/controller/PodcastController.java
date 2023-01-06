package mk.fcse.musicplatformbackend.web.controller;

import mk.fcse.musicplatformbackend.model.helper.PodcastsViewHelper;
import mk.fcse.musicplatformbackend.service.PodcastService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/podcasts")
@CrossOrigin
public class PodcastController {

    private final PodcastService podcastService;

    public PodcastController(PodcastService podcastService) {
        this.podcastService = podcastService;
    }

    @GetMapping("/all")
    public List<PodcastsViewHelper> getAllPodcasts() {
        return podcastService.listPodcastHelpers();
    }

}
