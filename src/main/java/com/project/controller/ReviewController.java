package com.project.controller;

import com.project.model.Review;
import com.project.service.ReviewService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public Review add(@RequestBody Review review) {
        return reviewService.addReview(review);
    }

    @GetMapping("/movie/{movieId}")
    public List<Review> getByMovie(@PathVariable Long movieId) {
        return reviewService.getReviewsByMovie(movieId);
    }
}
