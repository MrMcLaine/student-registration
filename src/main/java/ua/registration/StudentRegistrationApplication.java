package ua.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.registration.repository.StudentRepository;

@SpringBootApplication
public class StudentRegistrationApplication implements CommandLineRunner {
	@Autowired
	StudentRepository repository;

	public static void main(String[] args) {

		SpringApplication.run(StudentRegistrationApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		/*Student student = new Student("Vasya", "Pupkin", 25, "pup@gmail.com", "password");
		repository.save(student);*/
	}
}
