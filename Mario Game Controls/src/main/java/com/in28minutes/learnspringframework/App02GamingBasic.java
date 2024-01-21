package com.in28minutes.learnspringframework;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App02GamingBasic {

	public static void main(String[] args) {
		//launch the Spring context
		try(var context =  new AnnotationConfigApplicationContext(HelloWorldConfigration.class)){
			

	//  configure  the things that we want Spring to manage @Configration
		// name -  @Bean
		// Retrieving Beans managed by Spring 
	System.out.println(context.getBean("name"));
	System.out.println(context.getBean("person"));
	System.out.println(context.getBean("person2MethodCall"));
	}

}
}