package two_satates_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import two_states_utility.Constlabels;
import two_states_utility.DbConnection;

@Repository("moviesRecordDao")
public class MoviesRecordDaoImpl implements MoviesRecordDao {
	public Connection con;

	public MoviesRecordDaoImpl() {
		try {
			this.con = DbConnection.getConnection();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public ResultSet getMoviesDetails() {

		try {
			PreparedStatement stm = con.prepareStatement(Constlabels.getMoviesQuery);
			ResultSet result = stm.executeQuery();
			return result;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
