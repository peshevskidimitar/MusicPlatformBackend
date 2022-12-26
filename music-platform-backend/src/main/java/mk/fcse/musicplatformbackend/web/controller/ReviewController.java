package mk.fcse.musicplatformbackend.web.controller;

import mk.fcse.musicplatformbackend.service.ReviewService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/reviews")
@CrossOrigin
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping("/add")
    public void insertNewReview(@RequestParam String content,
                         @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateCreated,
                         @RequestParam Integer audioContentId,
                         @RequestParam Integer userId,
                         @RequestParam Integer grade) {
        reviewService.insertNewReview(content, dateCreated, audioContentId, userId, grade);
    }

}
