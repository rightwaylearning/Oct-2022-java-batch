package com.rwl.in.dao;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("movieFinder")
@Scope("singleton")
public class MovieFinder {  // movieFinder

	public String[] showMovieNames() {
		
		return new String[] {"KGF capter 2", "RRR"};
		
	}
}
