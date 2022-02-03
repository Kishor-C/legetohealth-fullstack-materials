package com.legatohealth;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.legatohealth.controller.UserRest;
import com.legatohealth.service.UserService;
//this creates an instance of UserRest, and also web environment for testing
@WebMvcTest(value = UserRest.class) 
class SpringBootAppApplicationTests {

	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private UserService service;
	
	@Test
	public void testForOkStatus() throws Exception {
		//service.update() -> result -> controller prepares some result
		mvc.perform(get("/api/user")).andExpect(status().isOk());
	}

}
