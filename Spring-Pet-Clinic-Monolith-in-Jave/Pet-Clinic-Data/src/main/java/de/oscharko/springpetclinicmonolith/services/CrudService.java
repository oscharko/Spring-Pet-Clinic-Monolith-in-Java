package de.oscharko.springpetclinicmonolith.services;

import java.util.Set;

/**
 * Created by oscharko on 14.07.22 😎 Check out -> www.oscharko.de --------------------
 * Inside the module - Pet-Clinic-Data Inside the package -
 * de.oscharko.springpetclinicmonolith.services --------------------
 */
public interface CrudService<T, ID> {

	Set<T> findAll();

	T findById(ID id);

	T save(T object);

	void delete(T object);

	void deleteById(ID id);

}
