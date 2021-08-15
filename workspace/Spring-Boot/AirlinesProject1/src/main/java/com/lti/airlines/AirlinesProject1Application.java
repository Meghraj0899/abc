package com.lti.airlines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@ComponentScan("com.lti.airlines")
public class AirlinesProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(AirlinesProject1Application.class, args);
	}
	@SuppressWarnings("deprecation")
    @Bean
    public WebMvcConfigurer corsConfigurer() {
          return new WebMvcConfigurerAdapter() {
             @Override
             public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/productRest/api").allowedOrigins("http://localhost:4200");//look for this error
                registry.addMapping("/flightSchedule/api").allowedOrigins("http://localhost:4200");
             }
          };
       }

}
