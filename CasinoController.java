package  com.xworkz.goaMvc.controller;

import org.springframework.ui.Model;

//import javax.enterprise.inject.Model;


import org.springframework.web.bind.annotation.PostMapping;

import com.xworkz.goaMvc.dto.CasinoDTO;



public class CasinoController {
	
	public  CasinoController() {
		System.out.println("Created"+ this.getClass().getSimpleName());
		
	}
	@PostMapping
	public String doGambling(CasinoDTO dto,Model model) {
		System.out.println("running doGambling..."+dto);
		
		model.addAttribute("Name:", dto.getName());
		model.addAttribute("Entryfee:",dto.getEntryFee());
		return"CasinoSuccess.jsp";
	}
	

}
