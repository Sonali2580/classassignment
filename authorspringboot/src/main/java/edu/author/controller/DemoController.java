package edu.author.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.author.entity.Author;

@RestController
public class DemoController {

	@GetMapping("/")
	public String printFullName() {
		Author a = new Author();
		a.setId(12);
		a.setFirstName("amitava");
		a.setLastName("Chatterjee");
		return "<body bgcolor='blue' color='white'><h1> I am " + a.getId() + " " + a.getFirstName() + " "
				+ a.getLastName() + "</h1></body>";
	}
}
