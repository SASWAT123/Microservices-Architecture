package com.example.movieratingsservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieratingsservice.model.MovieRating;
import com.example.movieratingsservice.model.UserRating;

@RestController
@RequestMapping("/rating")
public class MovieRatingController {
	
	@RequestMapping("/{movieId}")
	public MovieRating getMovieRating(@PathVariable("movieId") String movieId) {
		return new MovieRating(movieId, 5);
	}
	
	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId){
		List<MovieRating> ratings = Arrays.asList(
				new MovieRating("1234", 4),
				new MovieRating("5678", 3)
			);
		
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		
		return userRating;
	}
}
