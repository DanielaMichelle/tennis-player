package io.datajek.springdatajpa;

import io.datajek.springdata.tennisplayer.PlayerDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


@SpringBootApplication
public class TennisPlayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerApplication.class, args);
	}

}
