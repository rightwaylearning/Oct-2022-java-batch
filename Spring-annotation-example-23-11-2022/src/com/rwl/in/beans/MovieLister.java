package com.rwl.in.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.rwl.in.dao.MovieFinder;

@Component("movieLister")  
@Scope("singleton")
public class MovieLister {

	@Value("${msg}")
	public String message = "hello";
	
    @Autowired
    @Qualifier("movieFinder")
	public MovieFinder movieFinder;
	
  
    
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	public MovieFinder getFinder() {
		return movieFinder;
	}

	public void setFinder(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}

}
