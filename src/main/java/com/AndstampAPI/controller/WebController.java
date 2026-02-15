package com.AndstampAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	    @GetMapping("/search")
	    public String searchStamps(@RequestParam String keyword, Model model) {
	        model.addAttribute("stamps", service.searchByStampName(keyword));
	        return "index";
	    }

}
