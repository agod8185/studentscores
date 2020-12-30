package com.springboot.springbootstudentscroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan({"com.springboot.springbootstudentscores.client"})

public class SpringbootStudentscroesApplication{

public static void main(String[] args) {
		SpringApplication.run(SpringbootStudentscroesApplication.class, args);
	}

}

