package org.weinnovate.jf092018.spring.ioc.cfgclass;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.weinnovate.jf092018.spring.ioc.cfgclass")
public class MyConfig {
	@Bean
	@Qualifier("hondaCity")
	public Car hondaCity() {
		return new HondaCity();
	}
	
	@Bean
	@Qualifier("hondaAmaze")
	public Car hondaAmaze() {
		return new HondaAmaze();
	}
}
