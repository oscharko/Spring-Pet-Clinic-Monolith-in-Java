package de.oscharko.springpetclinicmonolith.model;

/**
 * IntelliJ IDEA 2022.2 (Ultimate Edition)
 * Created by oscharko on 27.07.22 😎
 * Check out -> www.oscharko.de
 * Spring-Pet-Clinic-Monolith-in-Java
 * Inside the module - test
 * Inside the package - de.oscharko.springpetclinicmonolith.model
 */
public class Speciality extends BaseEntity {

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
