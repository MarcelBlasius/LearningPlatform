package com.learning.LearningPlatform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class LearningPlatformApplication {
	public static void main(String[] args) {
		SpringApplication.run(LearningPlatformApplication.class, args);
	}
}
