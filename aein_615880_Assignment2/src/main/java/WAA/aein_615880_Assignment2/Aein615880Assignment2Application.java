package WAA.aein_615880_Assignment2;

import data.CourseData;
import data.StudentsData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controllers","repos","models","data"})
public class Aein615880Assignment2Application {

	public static void main(String[] args) {

		SpringApplication.run(Aein615880Assignment2Application.class, args);
	}

}
