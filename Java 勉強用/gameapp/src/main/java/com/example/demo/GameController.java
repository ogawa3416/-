package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {

	// @RequestMapping("/trump")
	// public String trump() {
	// Run.main(null);
	// String text = Run.output;
	// return text;
	// }

	@RequestMapping("/")
	public String index(Model model) {
		Run.run();
		String text = Run.output;
		String text2 = Run.outputResult;
		model.addAttribute("msg1", text);
		model.addAttribute("msg2", text2);
		return "index";
	}
}
