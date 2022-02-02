package com.legatohealth.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/*
 * Controller needs to handle the request and generate the response i.e., view name
 * View must show the dynamic data (Model) i.e., JSP shows some model
 */
@Controller
@RequestMapping("/user")
public class UserController {
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
