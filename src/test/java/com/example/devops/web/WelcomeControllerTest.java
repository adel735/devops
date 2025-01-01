package com.example.devops.web;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

<<<<<<< HEAD
import org.junit.Test;
import org.junit.Before;
=======
import org.junit.Before;
import org.junit.Test;
>>>>>>> feature/nv101_initial_landing_homepage
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
<<<<<<< HEAD
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


=======
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

>>>>>>> feature/nv101_initial_landing_homepage
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class WelcomeControllerTest {
<<<<<<< HEAD

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext context;

=======
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext context;
	
>>>>>>> feature/nv101_initial_landing_homepage
	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void testWelcome() throws Exception {
<<<<<<< HEAD

		mockMvc.perform(get("/")).andExpect(status().isOk());

	}}
=======
		mockMvc.perform(get("/")).andExpect(status().isOk());
	}

}
>>>>>>> feature/nv101_initial_landing_homepage
