package com.autowire.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.autowire.AnnotationAutowire.Student;
import com.autowire.AnnotationAutowire.Subject;

@Configuration
public class Config {
	
	@Bean
	public Subject subjects() {
		
		Subject subObj = new Subject();
		List<String> l1 = new ArrayList<String>();
		
		l1.add("English");
		l1.add("Math");
		l1.add("Marathi");
		
		subObj.setSubjects(l1);
		
		
		
		return subObj;
	}
	@Bean
	public Student sudents() {
		
		Student stuObj = new Student();
		stuObj.setName("Ganesh");
		stuObj.setMarks("100");
//		stuObj.setStuSubjects(subjects());
		
		return stuObj;
		
	}
}
