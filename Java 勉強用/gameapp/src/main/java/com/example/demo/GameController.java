package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

	@RequestMapping("/trump")
	public String trump() {
		Run.main(null);
		String text = Run.output;
		return text;
	}
}
