package com.SpringMVC.config;

import javax.persistence.ElementCollection;
import javax.persistence.FetchType;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JPAMapperConfig {
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
}
