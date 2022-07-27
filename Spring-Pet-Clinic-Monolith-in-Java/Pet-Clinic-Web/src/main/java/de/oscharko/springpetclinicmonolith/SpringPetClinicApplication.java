package de.oscharko.springpetclinicmonolith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * IntelliJ IDEA 2022.2 (Ultimate Edition)
 * Created by oscharko on 13.07.22 😎
 * Check out -> www.oscharko.de
 * Spring-Pet-Clinic-Monolith-in-Java
 * Inside the module - Pet-Clinic-Web
 * Inside the package - de.oscharko.springpetclinicmonolith
 */
@SpringBootApplication
@EntityScan("de.oscharko.springpetclinicmonolith")
@EnableJpaRepositories("de.oscharko.springpetclinicmonolith")
public class SpringPetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPetClinicApplication.class, args);
	}

}
