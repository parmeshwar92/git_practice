package com.param.git;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitPracticeApplication {
	private static final Logger logger= LoggerFactory.getLogger(GitPracticeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GitPracticeApplication.class, args);
		logger.info("first commit");
		logger.info("second commit");
		logger.info("third commit");
		logger.info("fourth commit");
		logger.info("fifth commit");
		logger.info("six added  for cherry commit");
	}

}
