package com.divyaa.events;

import com.divyaa.events.service.PublishToKafka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EventsApplication.class, args);
	}

	@Autowired
	PublishToKafka publishToKafka;

	@Override
	public void run(String... args) throws Exception {
		publishToKafka.sendMessage("Hello world!");
	}
}
