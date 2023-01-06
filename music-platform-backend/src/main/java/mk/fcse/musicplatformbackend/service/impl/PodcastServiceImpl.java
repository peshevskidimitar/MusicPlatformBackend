package mk.fcse.musicplatformbackend.service.impl;

import mk.fcse.musicplatformbackend.model.helper.MusicProfessionalHelper;
import mk.fcse.musicplatformbackend.model.helper.PodcastsViewHelper;
import mk.fcse.musicplatformbackend.model.view.PodcastsView;
import mk.fcse.musicplatformbackend.repository.PodcastsViewRepository;
import mk.fcse.musicplatformbackend.service.PodcastService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Override
    public List<PodcastsViewHelper> listPodcastHelpers() {
        List<PodcastsViewHelper> list = new ArrayList<>();
        for (PodcastsView podcastsView : podcastsViewRepository.findAll()) {
            PodcastsViewHelper podcastsViewHelper = list.stream()
                    .filter(element -> element.getPodcastTitle().equals(podcastsView.getPodcastTitle()))
                    .findFirst()
                    .orElse(null);

            if (podcastsViewHelper == null) {
                podcastsViewHelper = new PodcastsViewHelper(
                        podcastsView.getId(),
                        podcastsView.getPodcastTitle(),
                        podcastsView.getPodcastDatePublished(),
                        podcastsView.getPodcastDescription(),
                        podcastsView.getGenreName()
                );

                list.add(podcastsViewHelper);
            }

            if (podcastsView.getMusicProfessionalName() != null
                    && podcastsView.getMusicProfessionalSurname() != null
                    && podcastsView.getMusicProfessionalProfession() != null) {
                podcastsViewHelper.getMusicProfessionals().add(new MusicProfessionalHelper(
                        podcastsView.getMusicProfessionalName(),
                        podcastsView.getMusicProfessionalSurname(),
                        podcastsView.getMusicProfessionalProfession()
                ));
            }
        }

        return list;
    }

}
