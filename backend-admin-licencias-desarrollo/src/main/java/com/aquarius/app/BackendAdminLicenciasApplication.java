package com.aquarius.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class BackendAdminLicenciasApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendAdminLicenciasApplication.class, args);
	}
	
	/*@SuppressWarnings("deprecation")
	@Bean
	    public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurerAdapter() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/**")
	                        .allowedOrigins("*")
	                        .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD")
	                        .allowedHeaders("header1", "header2") //What is this for?
	                        .allowCredentials(true);
	            }
	        };
	    }*/

}
