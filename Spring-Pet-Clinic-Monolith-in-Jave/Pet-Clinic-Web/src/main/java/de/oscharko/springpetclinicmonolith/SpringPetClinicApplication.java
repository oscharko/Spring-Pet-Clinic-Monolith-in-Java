package de.oscharko.springpetclinicmonolith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by oscharko on 13.07.22 😎 Check out -> www.oscharko.de --------------------
 * Inside the module - Pet-Clinic-Web Inside the package -
 * de.oscharko.springpetclinicmonolith --------------------
 */
@SpringBootApplication(scanBasePackages = { "de.oscharko" })
public class SpringPetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPetClinicApplication.class, args);
	}

}
