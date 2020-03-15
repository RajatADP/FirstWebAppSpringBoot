package com.learning.clientDataToWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientToWebAppModelViewController {

	@RequestMapping("/client")
	public ModelAndView clientToWebApp(@RequestParam("cname") String clientName) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("clientName", clientName);
		mv.setViewName("clientToWeb");
		return mv;
	}
}
