package  com.xworkz.goaMvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goaMvc.dto.BeachDTO;


@Component
@RequestMapping("/sea")
public class BeachController {
	
	public BeachController(){
		System.out.println("Created" + this.getClass().getSimpleName());
	}
	@PostMapping
	public String toDance(BeachDTO dto,Model model) {
		System.out.println("running toDance...."+ dto);
		model.addAttribute("Name :", dto.getName());
		model.addAttribute("Game :", dto.getGame());
		return "BeachSuccess.jsp";

	}

}
