package org.weinnovate.jf092018.spring.spel.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "org.weinnovate.jf092018.spring.spel.annotation")
@PropertySource("classpath:car.properties")
public class MyConfig {

}
