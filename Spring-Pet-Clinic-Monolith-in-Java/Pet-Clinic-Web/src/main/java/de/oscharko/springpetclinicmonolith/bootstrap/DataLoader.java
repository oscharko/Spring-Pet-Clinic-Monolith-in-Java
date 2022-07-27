package de.oscharko.springpetclinicmonolith.bootstrap;

import de.oscharko.springpetclinicmonolith.model.Owner;
import de.oscharko.springpetclinicmonolith.model.Vet;
import de.oscharko.springpetclinicmonolith.services.OwnerService;
import de.oscharko.springpetclinicmonolith.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * IntelliJ IDEA 2022.2 (Ultimate Edition)
 * Created by oscharko on 18.07.22 😎
 * Check out -> www.oscharko.de
 * Spring-Pet-Clinic-Monolith-in-Java
 * Inside the module - test
 * Inside the package - de.oscharko.springpetclinicmonolith.model
 */
@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;

	private final VetService vetService;

	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;

		this.vetService = vetService;
	}

	@Override
	public void run(String... args) {

		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenna");

		ownerService.save(owner2);

		System.out.println("Loaded Owners...." + ownerService.findAll().size());

		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");

		vetService.save(vet2);

		System.out.println("Loaded Vets...." + vetService.findAll().size());
	}

}
