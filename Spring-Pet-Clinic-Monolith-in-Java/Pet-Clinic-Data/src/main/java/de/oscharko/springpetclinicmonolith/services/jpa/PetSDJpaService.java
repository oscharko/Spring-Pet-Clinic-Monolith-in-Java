package de.oscharko.springpetclinicmonolith.services.jpa;

import de.oscharko.springpetclinicmonolith.model.Pet;
import de.oscharko.springpetclinicmonolith.repositories.PetRepository;
import de.oscharko.springpetclinicmonolith.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * IntelliJ IDEA 2022.2 (Ultimate Edition)
 * Created by oscharko on 02.08.22 - 22:50 😎
 * Check out -> www.oscharko.de
 * Spring-Pet-Clinic-Monolith-in-Java
 * Inside the module - Pet-Clinic-Data
 * Inside the package - de.oscharko.springpetclinicmonolith.services.jpa
 */
@Service
@Profile("jpa")
public class PetSDJpaService implements PetService {
    private final PetRepository petRepository;

    public PetSDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
