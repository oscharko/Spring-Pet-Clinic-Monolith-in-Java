package de.oscharko.springpetclinicmonolith.services.map;

import de.oscharko.springpetclinicmonolith.model.Vet;
import de.oscharko.springpetclinicmonolith.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * IntelliJ IDEA 2022.2 (Ultimate Edition)
 * Created by oscharko on 14.07.22 😎
 * Check out -> www.oscharko.de
 * Spring-Pet-Clinic-Monolith-in-Java
 * Inside the module - test
 * Inside the package - de.oscharko.springpetclinicmonolith.model
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		return super.save(object);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
