package com.avk.practise.springbootactivemqreceiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.*")
public class SpringBootActivemqReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActivemqReceiverApplication.class, args);
	}

}
