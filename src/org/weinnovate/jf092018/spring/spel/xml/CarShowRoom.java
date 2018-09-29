package org.weinnovate.jf092018.spring.spel.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarShowRoom {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"org/weinnovate/jf092018/spring/spel/xml/spel-spring-config.xml");
		Car car = (Car) context.getBean("car");
		car.driveTheCar();
	}

}
