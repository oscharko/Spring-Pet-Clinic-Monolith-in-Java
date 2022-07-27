package de.oscharko.springpetclinicmonolith.model;

import java.util.Set;

/**
 * Created by oscharko on 13.07.22 😎 Check out -> www.oscharko.de --------------------
 * Inside the module - Pet-Clinic-Data Inside the package -
 * de.oscharko.springpetclinicmonolith.model --------------------
 */
public class Owner extends Person {
    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
