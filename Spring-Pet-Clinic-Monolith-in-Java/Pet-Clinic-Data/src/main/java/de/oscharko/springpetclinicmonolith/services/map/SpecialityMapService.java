package de.oscharko.springpetclinicmonolith.services.map;

import de.oscharko.springpetclinicmonolith.model.Speciality;
import de.oscharko.springpetclinicmonolith.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * IntelliJ IDEA 2022.2 (Ultimate Edition)
 * Created by oscharko on 27.07.22 😎
 * Check out -> www.oscharko.de
 * Spring-Pet-Clinic-Monolith-in-Java
 * Inside the module - Pet-Clinic-Data
 * Inside the package - de.oscharko.springpetclinicmonolith.services.map
 */
@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialtyService {

	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Speciality object) {
		super.delete(object);
	}

	@Override
	public Speciality save(Speciality object) {
		return super.save(object);
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}

}
