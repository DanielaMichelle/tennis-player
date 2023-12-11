package io.datajek.springdata.tennisplayer;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


@SpringBootApplication
public class TennisPlayerApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PlayerDao dao;

	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerApplication.class, args);
		System.out.println("hellooo");
	}

	@Override
	public void run(String... args) throws Exception {
		// SELECT
		logger.info("All Players Data: {} ", dao.getAllPlayers());
		logger.info("Player with Id 3: {}", dao.getPlayerById(3));

		// INSERT
		logger.info("Inserting Player 4: {}", dao.insertPlayer(
				new Player (4, "Thiem", "Austria",
						new Date(System.currentTimeMillis()),
						17 )));
		logger.info("All Players Data: {}", dao.getAllPlayers());

		// UPDATE
		//Updating a player
		logger.info("Updating Player with Id 4: {}",  dao.updatePlayer(
				new Player(4, "Thiem", "Austria",
						java.sql.Date.valueOf("1993-09-03"), 17)));

		//View player by Id
		logger.info("Players with Id 4: {}", dao.getPlayerById(4));

		// DELETE
		logger.info("Deleting Player with Id 2: {}", dao.deletePlayerById(2));
		logger.info("All Players Data: {}", dao.getAllPlayers());

		// CREATE A TABLE
		dao.createTournamentTable();
	}
}
