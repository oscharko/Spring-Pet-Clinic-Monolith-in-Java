package de.oscharko.springpetclinicmonolith.controllers;

import org.springframework.stereotype.Controller;
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
public class IndexController {

	@RequestMapping({ "", "/", "/index", "/index.html" })
	public String index() {
		return "index";
	}

}
