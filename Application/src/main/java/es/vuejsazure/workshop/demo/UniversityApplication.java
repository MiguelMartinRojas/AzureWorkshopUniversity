package es.vuejsazure.workshop.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import es.vuejsazure.workshop.demo.entities.MyAspect;
import es.vuejsazure.workshop.demo.entities.Todo;

@SpringBootApplication
@EnableAspectJAutoProxy

public class UniversityApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(UniversityApplication.class, args);
	}
	@Bean MyAspect myAspect(){
		return new MyAspect();
	}
}
