package com.vedait.springbootproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavController {
	
	@GetMapping("/")
    public String home() {
        return "index";
    }

	@GetMapping("/adminlogin")
    public String adminLogin() {
        return "adminlogin"; 
    }

    @GetMapping("/doctorlogin")
    public String doctorLogin() {
        return "doctorlogin"; 
    }

    @GetMapping("/userlogin")
    public String userLogin() {
        return "userlogin";
    }
}


