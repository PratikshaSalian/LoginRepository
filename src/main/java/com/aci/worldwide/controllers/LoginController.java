package com.aci.worldwide.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aci.worldwide.entities.User;
import com.aci.worldwide.services.UserService;

//pojo class
//presentation layer(request processing component)
@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/signin")  //handler mapping to map url request to the controller method
	public String validateUser(User user,ModelMap map)
	{
	 //invokes bl logic
		if(userService.isValidUser(user))
		{
			map.addAttribute("uname",user.getUsername()); //login controller renders success 
			return "success";                            //both of them are modelandviewobject
		}
		else
		{
			map.addAttribute("logonerror","Invalid username/Password");
			return "login";
		}
			
		}
	}
	


