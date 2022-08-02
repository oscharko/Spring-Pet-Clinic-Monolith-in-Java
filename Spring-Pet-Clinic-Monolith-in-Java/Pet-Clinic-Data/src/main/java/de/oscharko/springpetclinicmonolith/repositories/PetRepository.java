package de.oscharko.springpetclinicmonolith.repositories;

import de.oscharko.springpetclinicmonolith.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * IntelliJ IDEA 2022.2 (Ultimate Edition)
 * Created by oscharko on 02.08.22 😎
 * Check out -> www.oscharko.de
 * Spring-Pet-Clinic-Monolith-in-Java
 * Inside the module - Pet-Clinic-Data
 * Inside the package - de.oscharko.springpetclinicmonolith.repositories
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
