package org.weinnovate.jf092018.spring.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HondaCity implements Car {

	private String color;
	
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	@Autowired
	@Qualifier("ashokaLeLand")
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public HondaCity() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	@Override
	public void driveTheCar() {
		System.out.println("Driving the " + this.getClass().getSimpleName() + " of " + color + " color");
		engine.move();
	}
}
