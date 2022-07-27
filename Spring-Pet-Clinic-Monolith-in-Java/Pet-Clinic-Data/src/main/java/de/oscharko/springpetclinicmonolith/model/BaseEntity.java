package de.oscharko.springpetclinicmonolith.model;

import java.io.Serializable;

/**
 * IntelliJ IDEA 2022.2 (Ultimate Edition)
 * Created by oscharko on 14.07.22 😎
 * Check out -> www.oscharko.de
 * Spring-Pet-Clinic-Monolith-in-Java
 * Inside the module - test
 * Inside the package - de.oscharko.springpetclinicmonolith.model
 */
public class BaseEntity implements Serializable {

	public Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
