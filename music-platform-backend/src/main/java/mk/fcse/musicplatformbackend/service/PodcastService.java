package mk.fcse.musicplatformbackend.service;

import mk.fcse.musicplatformbackend.model.view.PodcastsView;

import java.util.List;

public interface PodcastService {
    List<PodcastsView> listPodcasts();
}
