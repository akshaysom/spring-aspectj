package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import service.MainService;

@RestController
public class MainController {
	
	@Autowired
	MainService service;
	

	public MainController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/api")
	public String apiCall() {
		return service.apiService();
	}
	

}
