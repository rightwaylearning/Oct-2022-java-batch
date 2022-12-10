package two_states_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import two_satates_service.Movie;
import two_satates_service.MoviesRecordService;

@Controller
public class MoviesRecordController {
	
	@Autowired
	public MoviesRecordService moviesRecordService;

    public List<Movie> getMoviesList(){
    	return moviesRecordService.getMoviesDetails();
    }
}
