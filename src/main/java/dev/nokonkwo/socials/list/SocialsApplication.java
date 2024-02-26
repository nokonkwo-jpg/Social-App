package dev.nokonkwo.socials.list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
@EnableSwagger2
@EnableConfigurationProperties
@SpringBootApplication
public class SocialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialsApplication.class, args);
	}

}
