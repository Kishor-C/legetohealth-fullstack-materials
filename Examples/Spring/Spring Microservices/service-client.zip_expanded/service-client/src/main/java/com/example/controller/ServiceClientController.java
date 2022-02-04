package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.client.Client;

@RestController
@RequestMapping("myclient")
public class ServiceClientController {

	@Autowired
	private RestTemplate template; // this has methods like get(), post(), put(), delete()
	
	@Autowired
	private Client client; 
	
	@GetMapping("one")
	public ResponseEntity<Object> callFirstApp() {
		String url = "http://FIRSTAPP/myfirstapp"; // we are using logical name
		// getForObject gets the data from the webserivce & 2nd argument is the converted data
		String data = template.getForObject(url, String.class); 
		return ResponseEntity.status(200).body("Second App Calling "+data);
	}
	@GetMapping("oneMore")
	public ResponseEntity<Object> callFirstAppAgain() {
		String data = client.invokeFirstApp(); // sends request to http://FIRSTAPP/myfirstapp
		return ResponseEntity.status(200).body("Second App called through feign "+data);
	}
}
