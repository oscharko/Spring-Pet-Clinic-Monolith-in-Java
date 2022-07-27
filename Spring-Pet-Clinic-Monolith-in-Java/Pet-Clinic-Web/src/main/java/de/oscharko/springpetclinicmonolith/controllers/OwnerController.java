package de.oscharko.springpetclinicmonolith.controllers;

import de.oscharko.springpetclinicmonolith.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by oscharko on 15.07.22 😎 Check out -> www.oscharko.de --------------------
 * Inside the module - Pet-Clinic-Web Inside the package -
 * de.oscharko.springpetclinicmonolith.controllers --------------------
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

	private final OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}

	@RequestMapping({ "", "/", "/index", "/index.html" })
	public String listOwners(Model model) {

		model.addAttribute("owners", ownerService.findAll());

		return "owners/index";
	}

}
