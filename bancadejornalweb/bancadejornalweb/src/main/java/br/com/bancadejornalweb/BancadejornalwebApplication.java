package br.com.bancadejornalweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BancadejornalwebApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BancadejornalwebApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BancadejornalwebApplication.class);
	}
}