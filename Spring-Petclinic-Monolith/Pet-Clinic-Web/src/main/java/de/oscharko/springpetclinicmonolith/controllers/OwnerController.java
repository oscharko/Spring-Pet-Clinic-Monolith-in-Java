package de.oscharko.springpetclinicmonolith.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by oscharko on 15.07.22 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Inside the module  - Pet-Clinic-Web
 * Inside the package - de.oscharko.springpetclinicmonolith.controllers
 * --------------------
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwner() {
        return "owners/index";
    }
}
