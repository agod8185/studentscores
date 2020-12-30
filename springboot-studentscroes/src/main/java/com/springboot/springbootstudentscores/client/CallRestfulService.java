package com.springboot.springbootstudentscores.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.springboot.springbootstudentscores.model.Student;

@Component
public class CallRestfulService implements CommandLineRunner{
	
	public static void CallRestfulService() {
		
		RestTemplate restTemplate = new RestTemplate();
        Student student = restTemplate.getForObject("http://live-test-scores.herokuapp.com/scores", Student.class);
        System.out.println("Persons name is " +student.getStudentId());
	}
	
	@Override
	public void run(String... args) throws Exception{
		
		CallRestfulService();
	}

}
