package org.weinnovate.jf092018.spring.spel.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarShowRoom {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Car car = (Car) context.getBean("ha");
		car.driveTheCar();
	}

}
