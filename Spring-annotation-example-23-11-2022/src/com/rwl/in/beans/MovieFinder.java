package com.rwl.in.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singletone")
public class MovieFinder {  // movieFinder

	public String[] showMovieNames() {
		
		return new String[] {"KGF capter 2", "RRR"};
		
	}
}
