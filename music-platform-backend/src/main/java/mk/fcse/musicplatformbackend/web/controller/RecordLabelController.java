package mk.fcse.musicplatformbackend.web.controller;

import mk.fcse.musicplatformbackend.model.RecordLabel;
import mk.fcse.musicplatformbackend.service.RecordLabelService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/record-labels")
@CrossOrigin
public class RecordLabelController {

    private final RecordLabelService recordLabelService;

    public RecordLabelController(RecordLabelService recordLabelService) {
        this.recordLabelService = recordLabelService;
    }

    @GetMapping("/all")
    public List<RecordLabel> getAllRecordLabels() {
        return recordLabelService.findAll();
    }

}
