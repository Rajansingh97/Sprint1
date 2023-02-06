package tour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication(scanBasePackages="com.controller,com.dao")
@EntityScan("com.model")
@EnableJpaRepositories("com.dao")
public class TourTravel1Application {

	public static void main(String[] args) {
		SpringApplication.run(TourTravel1Application.class, args);
	}

}
