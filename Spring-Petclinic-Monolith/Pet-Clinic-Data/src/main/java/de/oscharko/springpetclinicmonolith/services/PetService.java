package de.oscharko.springpetclinicmonolith.services;

import de.oscharko.springpetclinicmonolith.model.Pet;

import java.util.Set;

/**
 * Created by oscharko on 14.07.22 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Inside the module  - Pet-Clinic-Data
 * Inside the package - de.oscharko.springpetclinicmonolith.services
 * --------------------
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
