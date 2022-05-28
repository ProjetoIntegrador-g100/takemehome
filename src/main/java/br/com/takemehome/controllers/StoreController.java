package br.com.takemehome.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StoreController {

	@RequestMapping("/store")
	public String storeapp() {
		return "store";
	}
}