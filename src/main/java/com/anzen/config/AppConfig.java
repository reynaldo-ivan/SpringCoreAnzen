package com.anzen.config;
  
import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;

import com.anzen.core.beans.CoreBean;

@Configuration
public class AppConfig {
	
	@Bean(name="coreConfig")
	public CoreBean coreConfig(){
		return new CoreBean();
	}
	 
	

}
