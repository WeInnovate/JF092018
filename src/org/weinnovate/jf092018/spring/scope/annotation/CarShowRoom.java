package org.weinnovate.jf092018.spring.scope.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarShowRoom {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		HondaCity car = (HondaCity) context.getBean("car");
		HondaCity car2 = (HondaCity) context.getBean("car");
		System.out.println(car.hashCode());
		System.out.println(car2.hashCode());
	}

}
