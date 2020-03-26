package com.agementfault.springcloudlesson1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudLesson1Application {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringCloudLesson1Application.class);
		application.run(args);

	}

}
