package org.weinnovate.jf092018.spring.scope.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarShowRoom {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"org/weinnovate/jf092018/spring/scope/xml/scope-spring-config.xml");
		HondaCity car = (HondaCity) context.getBean("car");
		HondaCity car2 = (HondaCity) context.getBean("car");
		System.out.println(car.hashCode());
		System.out.println(car2.hashCode());
	}

}
