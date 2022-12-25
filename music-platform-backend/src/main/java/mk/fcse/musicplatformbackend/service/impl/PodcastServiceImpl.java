package mk.fcse.musicplatformbackend.service.impl;

import mk.fcse.musicplatformbackend.model.view.PodcastsView;
import mk.fcse.musicplatformbackend.repository.PodcastsViewRepository;
import mk.fcse.musicplatformbackend.service.PodcastService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PodcastServiceImpl implements PodcastService {

    private final PodcastsViewRepository podcastsViewRepository;

    public PodcastServiceImpl(PodcastsViewRepository podcastsViewRepository) {
        this.podcastsViewRepository = podcastsViewRepository;
    }

    @Override
    public List<PodcastsView> listPodcasts() {
        return podcastsViewRepository.findAll();
    }

}
