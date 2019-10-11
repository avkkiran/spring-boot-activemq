package com.avk.practise.springbootactivemqsender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.*")
public class SpringBootActivemqSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActivemqSenderApplication.class, args);
	}

}
