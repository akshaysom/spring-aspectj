package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;


@Configuration
@ComponentScan(basePackages= {"aspect","controller","service"})
@EnableWebMvc
public class AppConfig extends WebMvcConfigurationSupport {

	public AppConfig() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public RequestMappingHandlerMapping createRequestMappingHandlerMapping() {
		RequestMappingHandlerMapping requestMappingHandlerMapping = super.createRequestMappingHandlerMapping();
		requestMappingHandlerMapping.setUseSuffixPatternMatch(false);
		requestMappingHandlerMapping.setUseTrailingSlashMatch(false);
		return requestMappingHandlerMapping;
	}

}
