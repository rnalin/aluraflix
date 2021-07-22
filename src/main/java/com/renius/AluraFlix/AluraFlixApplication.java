package com.renius.AluraFlix;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.renius.AluraFlix.model.Video;
import com.renius.AluraFlix.repositories.VideoRepository;

@SpringBootApplication
public class AluraFlixApplication implements CommandLineRunner{
	@Autowired
	private VideoRepository videoRepository;

	public static void main(String[] args) {
		SpringApplication.run(AluraFlixApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Video video1 = new Video(null, "Mozart Symphony No. 40 - 10 Hours", "The famous Mozart symphony no. 40 extended to full 10 Hours!","https://www.youtube.com/watch?v=EVZtEty8DQM" );
		Video video2 = new Video(null, "J.S. Bach: 6 Suites for Cello Solo (Full Album) played by István Várdai", "Young Hungarian cellist István Várdai is winner of the Geneva Competition, 3rd prize Tchaikovsky Competition 2007 and first prize winner of the prestigious ARD competition in 2014. ","https://www.youtube.com/watch?v=D83cMncj_Ig" );
		Video video3 = new Video(null, "Mozart: Eine kleine Nachtmusik - Concertgebouw Kamerorkest - Live Concert - HD", "Mozart: Eine kleine Nachtmusik in G major, KV 525 - Concertgebouw Chamber Orchestra Recorded the 14th of April 2013 - Concertgebouw Amsterdam","https://www.youtube.com/watch?v=QZWKUszkbXU" );
		
		videoRepository.saveAll(Arrays.asList(video1, video2, video3));
	}

}
