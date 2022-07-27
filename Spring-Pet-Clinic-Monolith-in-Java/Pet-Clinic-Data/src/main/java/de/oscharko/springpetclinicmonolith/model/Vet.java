package de.oscharko.springpetclinicmonolith.model;

import java.util.Set;

/**
 * IntelliJ IDEA 2022.2 (Ultimate Edition)
 * Created by oscharko on 13.07.22 😎
 * Check out -> www.oscharko.de
 * Spring-Pet-Clinic-Monolith-in-Java
 * Inside the module - test
 * Inside the package - de.oscharko.springpetclinicmonolith.model
 */
public class Vet extends Person {

	private Set<Speciality> specialities;

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}

}
