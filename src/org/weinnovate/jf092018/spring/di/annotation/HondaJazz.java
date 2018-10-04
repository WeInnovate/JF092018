package org.weinnovate.jf092018.spring.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HondaJazz implements Car {

	@Autowired
	@Qualifier("tata")
	private Engine engine;

	@Override
	public void driveTheCar() {
		System.out.println("Driving the " + this.getClass().getSimpleName());
		engine.move();
	}

}
