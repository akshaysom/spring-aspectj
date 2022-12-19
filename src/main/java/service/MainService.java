package service;

import org.springframework.stereotype.Service;

@Service
public class MainService {
  public String apiService() {
    return apiInnerService();
  }

  public String apiInnerService() {
    System.out.println("Innerservice");
    return "Success";
  }
}
