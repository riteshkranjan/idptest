package com.infosys.idp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.idp.service.WelcomeService;

@RestController
public class WelcomeController {

	private static final Logger log = LoggerFactory.getLogger(WelcomeController.class);
	@Autowired
	WelcomeService service;

	@RequestMapping("/")
	public void home(HttpServletResponse response) throws IOException {
		response.sendRedirect("/swagger-ui.html#/");
	}

	@GetMapping("hello/{name}")
	public String hello(@PathVariable final String name) {
		log.info("in WelcomeController hello method");
		return service.getName(name);
	}

}
