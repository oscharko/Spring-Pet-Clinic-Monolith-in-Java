package de.oscharko.springpetclinicmonolith.services;

import de.oscharko.springpetclinicmonolith.model.Vet;

import java.util.Set;

/**
 * Created by oscharko on 14.07.22 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Inside the module  - Pet-Clinic-Data
 * Inside the package - de.oscharko.springpetclinicmonolith.services
 * --------------------
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
