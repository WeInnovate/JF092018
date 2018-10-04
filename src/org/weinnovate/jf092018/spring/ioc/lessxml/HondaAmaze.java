package org.weinnovate.jf092018.spring.ioc.lessxml;

import org.springframework.stereotype.Component;

@Component
public class HondaAmaze implements Car {

	public HondaAmaze() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	@Override
	public void driveTheCar() {
		System.out.println("Driving the " + this.getClass().getSimpleName());
	}
}
