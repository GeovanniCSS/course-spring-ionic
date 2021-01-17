package com.course.coursemc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.course.coursemc.services.S3Service;

@SpringBootApplication
public class CoursemcApplication implements CommandLineRunner {

	@Autowired
	private S3Service s3Service;
	
	public static void main(String[] args) {
		SpringApplication.run(CoursemcApplication.class, args);
	}
	
	public void run(String... args) throws Exception {	
		s3Service.uploadFile("C:\\temp\\teste.jpg");
	}
}
