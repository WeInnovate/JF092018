package org.weinnovate.jf092018.spring.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HondaAmaze implements Car {

	private Engine engine;

	@Autowired
	public HondaAmaze(@Qualifier("tata") Engine engine) {
		super();
		this.engine = engine;
		System.out.println(this.getClass().getSimpleName() + " is being manufactured. \n");
	}

	public HondaAmaze() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	@Override
	public void driveTheCar() {
		System.out.println("Driving the " + this.getClass().getSimpleName());
		engine.move();
	}

	@Override
	public String toString() {
		return "HondaAmaze [engine=" + engine + "]";
	}
}
