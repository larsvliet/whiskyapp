package nl.junglejim.whiskyapp;

import java.time.Clock;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	
	public Clock clock() {
		return Clock.systemDefaultZone();
	}

}
