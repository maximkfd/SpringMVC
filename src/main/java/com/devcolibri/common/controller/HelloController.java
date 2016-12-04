package com.devcolibri.common.controller;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		Mongo mongo = new MongoClient("localhost", 27017);
		String point = mongo.getConnectPoint();

		model.addAttribute("message", point);
		return "hello";

	}
	
}