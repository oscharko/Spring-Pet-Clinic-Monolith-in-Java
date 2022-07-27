package de.oscharko.springpetclinicmonolith.controllers;

import de.oscharko.springpetclinicmonolith.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IntelliJ IDEA 2022.2 (Ultimate Edition)
 * Created by oscharko on 15.07.22 😎
 * Check out -> www.oscharko.de
 * Spring-Pet-Clinic-Monolith-in-Java
 * Inside the module - test
 * Inside the package - de.oscharko.springpetclinicmonolith.model
 */
@Controller
public class VetController {

	private final VetService vetService;

	public VetController(VetService vetService) {
		this.vetService = vetService;
	}

	@RequestMapping({ "/vets", "/vets/index", "/vets/index.html" })
	public String listVets(Model model) {

		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}

}
