package br.com.takemehome.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {

	@RequestMapping("/pet")
	public String petapp() {
		return "pet";
	}
}