package com.infosys.idp.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WelcomeServiceImplTest {
	@Autowired
	WelcomeService service;
	@Test
	public void testGetName() {
		Assert.assertTrue(service.getName(null), service.getName(null).equals("Hello empty or Null"));
		Assert.assertTrue(service.getName(""), service.getName("").equals("Hello empty or Null"));
		Assert.assertTrue(service.getName("somebody").equals("Hello somebody"));
		Assert.assertTrue(service.getName("r").equals("hello Ritesh"));
		Assert.assertTrue(service.getName("R").equals("hello Ritesh"));
		Assert.assertTrue(service.getName("h").equals("hello Harish"));
		Assert.assertTrue(service.getName("H").equals("hello Harish"));
		Assert.assertTrue(service.getName("M").equals("hello Mukesh"));
		Assert.assertTrue(service.getName("m").equals("hello Mukesh"));
		Assert.assertTrue(service.getName("x").equals("hello unknown"));
	}

}
