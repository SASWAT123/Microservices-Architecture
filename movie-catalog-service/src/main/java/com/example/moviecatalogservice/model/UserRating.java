package com.example.moviecatalogservice.model;

import java.util.List;

public class UserRating {
	
private List<MovieRating> userRating;
	
	public UserRating() {};

	public UserRating(List<MovieRating> userRating) {
		this.userRating = userRating;
	}

	public List<MovieRating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<MovieRating> userRating) {
		this.userRating = userRating;
	}

}
