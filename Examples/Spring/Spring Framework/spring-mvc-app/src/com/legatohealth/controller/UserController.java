package com.legatohealth.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.legatohealth.beans.User;
import com.legatohealth.service.UserService;
/*
 * Controller needs to handle the request and generate the response i.e., view name
 * View must show the dynamic data (Model) i.e., JSP shows some model
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	// it needs to read name, password & age from the view & return the response to the view
	// <input type = 'text' name = 'n1'> <input type = 'text' name = 'n2'>
	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public ModelAndView save(@RequestParam("n1") String name, @RequestParam("n2") String password, @RequestParam("n3") int age) {
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setPassword(password);
		userService.storeUser(user);
		return new ModelAndView("storeSuccess", "msg", "Stored Successfully");
	}
	// showing all the users
	@RequestMapping(value = "/fetchAll", method = RequestMethod.GET)
	public ModelAndView fetchAllUsers() {
		List<User> list = userService.findAllUsers();
		return new ModelAndView("storeSuccess", "msg", list);
	}
	// application-path/spring/user/datetime
	@RequestMapping(value = "/datetime", method = RequestMethod.GET)
	public ModelAndView home() {
		// it must have interacted with the service layer and get the model
		LocalDateTime modelDateTime = LocalDateTime.now();
		// ModelAndView is a wrapper of view name & model
		//1st arg is viewname, 2nd arg is the key, 3rd arg is the model
		ModelAndView mav = new ModelAndView("welcome", "date", modelDateTime);
		// now the welcome will be resolved by view resolver as /WEB-INF/pages/welcome.jsp
		return mav;
	}
}
