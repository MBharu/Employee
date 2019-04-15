package demo.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "demo.mongodb" })
@EnableMongoRepositories("demo.mongodb.dal")
public class EmployeeDBApp {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDBApp.class, args);
	}
}