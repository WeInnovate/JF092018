package org.weinnovate.jf092018.spring.ioc.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarShowRoom {

	public static void main(String[] args) {
//		HondaCity car = new HondaCity();
//		car.driveTheCar();

//		take help from spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/weinnovate/jf092018/spring/ioc/xml/ioc-spring-config.xml");
		Car car = (Car) context.getBean("car");
//		HondaCity car = (HondaCity) context.getBean("car");
//		HondaAmaze car2 = (HondaAmaze) context.getBean("car2");
		car.driveTheCar();
//		car2.driveTheCar();
	}

}
