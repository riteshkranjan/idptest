package com.infosys.idp.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.infosys.idp.service.WelcomeService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = WelcomeController.class)
public class WelcomeControllerTest {
	@Rule
	public TestName name = new TestName();

	@Autowired
	protected MockMvc mockMvc;
	
	@MockBean
	private WelcomeService service;

	@Before
	public void before() {
		System.out.println(String.format("Running Test %s : %s", super.getClass(), name.getMethodName()));
	}

	@Test
	public void testHome() throws Exception {
		 mockMvc.perform(get("/")).andExpect(status().isFound());
	}
	
	@Test
	public void testHello()throws Exception {
		when(service.getName("ritesh")).thenReturn("hello Ritesh");
		MvcResult result = mockMvc.perform(get("/hello/{name}","ritesh")).andExpect(status().isOk()).andReturn();
		Assert.assertEquals("hello Ritesh", result.getResponse().getContentAsString());
	}
}
