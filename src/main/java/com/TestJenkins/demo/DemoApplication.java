package com.TestJenkins.demo;

import com.TestJenkins.demo.entities.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner start(){
		return ars ->{
			Student student = new Student("abdelmounim","el moussaddar",23.0);

			student.toString();
		};
	}

}
