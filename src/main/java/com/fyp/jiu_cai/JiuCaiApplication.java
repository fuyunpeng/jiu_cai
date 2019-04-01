package com.fyp.jiu_cai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@SpringBootApplication
public class JiuCaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JiuCaiApplication.class, args);
	}

}
