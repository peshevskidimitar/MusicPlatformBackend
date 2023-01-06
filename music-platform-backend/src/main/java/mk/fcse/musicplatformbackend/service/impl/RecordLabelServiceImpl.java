package mk.fcse.musicplatformbackend.service.impl;

import mk.fcse.musicplatformbackend.model.RecordLabel;
import mk.fcse.musicplatformbackend.repository.RecordLabelRepository;
import mk.fcse.musicplatformbackend.service.RecordLabelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordLabelServiceImpl implements RecordLabelService {

    private final RecordLabelRepository recordLabelRepository;

    public RecordLabelServiceImpl(RecordLabelRepository recordLabelRepository) {
        this.recordLabelRepository = recordLabelRepository;
    }

    @Override
    public List<RecordLabel> findAll() {
        return recordLabelRepository.findAll();
    }

}
