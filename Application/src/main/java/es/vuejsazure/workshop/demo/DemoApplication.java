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

public class DemoApplication   extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Todo t = new Todo();
		t.setTitle("a");
	}
	@Bean MyAspect myAspect(){
		return new MyAspect();
	}
}
