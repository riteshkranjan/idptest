package com.infosys.idp.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {

	@Override
	public String getName(String s) {
		if (s == null || s.length() == 0)
			return "Hello empty or Null";
		if (s.length() > 1)
			return "Hello " + s;
		if (s.equalsIgnoreCase("h"))
			return "hello Harish";
		if (s.equalsIgnoreCase("r"))
			return "hello Ritesh";
		if (s.equalsIgnoreCase("m"))
			return "hello Mukesh";
		return "hello unknown";
	}

}
