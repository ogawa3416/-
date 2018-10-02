package com.example.demo;

import java.util.List;

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
		List<String> result = Run.run();
		String card1 = "1枚目:" + result.get(0);
		String card2 = "2枚目:" + result.get(1);
		String card3 = "3枚目:" + result.get(2);
		String card4 = "4枚目:" + result.get(3);
		String card5 = "5枚目:" + result.get(4);
		String Strongcard = result.get(5);

		model.addAttribute("card1", card1);
		model.addAttribute("card2", card2);
		model.addAttribute("card3", card3);
		model.addAttribute("card4", card4);
		model.addAttribute("card5", card5);
		model.addAttribute("result", Strongcard);
		return "index";
	}
}
