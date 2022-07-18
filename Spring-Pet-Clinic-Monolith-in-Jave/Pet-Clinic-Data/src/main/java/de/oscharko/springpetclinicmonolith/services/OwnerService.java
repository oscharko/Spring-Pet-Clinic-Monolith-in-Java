package de.oscharko.springpetclinicmonolith.services;

import de.oscharko.springpetclinicmonolith.model.Owner;

/**
 * Created by oscharko on 14.07.22 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Inside the module  - Pet-Clinic-Data
 * Inside the package - de.oscharko.springpetclinicmonolith.services
 * --------------------
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
