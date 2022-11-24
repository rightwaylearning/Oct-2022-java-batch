package com.rwl.in.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  
@Scope("singletone")
public class MovieLister {

	@Value("${msg}")
	public String message = "hello";
	
    @Autowired
    @Qualifier("movieFinder")
	public MovieFinder finder;
	
  
    
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	public MovieFinder getFinder() {
		return finder;
	}

	public void setFinder(MovieFinder finder) {
		this.finder = finder;
	}

}
