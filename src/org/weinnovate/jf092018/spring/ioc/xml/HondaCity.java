package org.weinnovate.jf092018.spring.ioc.xml;

public class HondaCity {

	public HondaCity() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	public void driveTheCar() {
		System.out.println("Driving the " + this.getClass().getSimpleName());
	}
}
