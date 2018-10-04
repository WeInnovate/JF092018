package org.weinnovate.jf092018.spring.ioc.lessxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarShowRoom {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/weinnovate/jf092018/spring/ioc/lessxml/ioc-lessxml-spring-config.xml");
//		Car car = (Car) context.getBean("hondaCity");
		Car car = (Car) context.getBean("hondaAmaze");
		car.driveTheCar();
	}

}
