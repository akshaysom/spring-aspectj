package config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.MainService;

@Configuration
@ComponentScan(basePackages = { "aop", "controller", "service" })
public class AppConfig {
  public static void main(String[] args) {
    try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class)) {
      MainService mainService = appContext.getBean(MainService.class);
      System.out.println(mainService.apiService());
    }
  }
}
