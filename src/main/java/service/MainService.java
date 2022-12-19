package service;

import org.springframework.stereotype.Service;

@Service
public class MainService {

	public MainService() {
		// TODO Auto-generated constructor stub
	}
	
	public String apiService() {
		return apiInnerService();
	}
	
	public String apiInnerService() {
		System.out.println("Innerservice");
		return "Success";
	}

}
