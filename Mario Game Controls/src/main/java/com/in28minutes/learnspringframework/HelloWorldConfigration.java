package com.in28minutes.learnspringframework;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
record Person(String name,int age) {};
@Configuration
public class HelloWorldConfigration {
@Bean
	public String name() {
		return "Surya";
	}
@Bean
public int age() {
	return 21;
}
@Bean 
public Person person() {
	return new Person("Ravi",21);
}
@Bean
public Person person2MethodCall() {
	return new Person(name(),age());
}

}
