package de.oscharko.springpetclinicmonolith.model;

import java.time.LocalDate;

/**
 * Created by oscharko on 13.07.22 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Inside the module  - Pet-Clinic-Data
 * Inside the package - de.oscharko.springpetclinicmonolith.model
 * --------------------
 */
public class Pet extends BaseEntity{
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
