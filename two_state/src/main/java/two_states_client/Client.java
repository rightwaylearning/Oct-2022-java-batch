package two_states_client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import two_satates_service.Movie;
import two_states_controller.MoviesRecordController;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");
		MoviesRecordController c = ctx.getBean(MoviesRecordController.class);
	    List<Movie> movies= c.getMoviesList();
	    System.out.println(movies);
	}
}
