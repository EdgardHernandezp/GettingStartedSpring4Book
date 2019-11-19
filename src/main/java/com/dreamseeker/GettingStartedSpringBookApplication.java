package com.dreamseeker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dreamseeker.beans.SgtPeppers;

@SpringBootApplication
public class GettingStartedSpringBookApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GettingStartedSpringBookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CDPlayerConfig.class)) {
			SgtPeppers bean = ctx.getBean(SgtPeppers.class);
			bean.play();
		}
	}

}
