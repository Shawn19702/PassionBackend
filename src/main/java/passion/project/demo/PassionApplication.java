package passion.project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import passion.project.demo.model.Image;
import passion.project.demo.repository.ImageRepository;

import java.util.Optional;

@SpringBootApplication
public class PassionApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassionApplication.class, args);

	}

}
