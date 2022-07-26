package de.oscharko.springpetclinicmonolith.model;

import java.io.Serializable;

/**
 * Created by oscharko on 14.07.22 😎 Check out -> www.oscharko.de --------------------
 * Inside the module - Pet-Clinic-Data Inside the package -
 * de.oscharko.springpetclinicmonolith.model --------------------
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
