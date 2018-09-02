package com.Sha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

	@RequestMapping("/userlist")
	public String userList() {
		return "userlist";
	}
	
    @GetMapping("/user")
    public String greeting(@RequestParam(name="user", required=false, defaultValue="user1") String name, Model model) {
        model.addAttribute("user", name);
        return "user";
    }
}
