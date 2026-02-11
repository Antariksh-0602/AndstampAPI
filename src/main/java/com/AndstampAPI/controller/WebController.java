package com.AndstampAPI.controller;

import com.AndstampAPI.Philately;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.AndstampAPI.service.PhilatelyService;

@SuppressWarnings("unused")
@Controller
public class WebController {
	private final PhilatelyService service;

	    public WebController(PhilatelyService service) {
	        this.service = service;
	    }

	    @GetMapping("/")
	    public String viewHomePage(Model model) {
	        model.addAttribute("stamps", service.getAllStamps());
	        return "index"; // loads templates/index.html
	    }

}
