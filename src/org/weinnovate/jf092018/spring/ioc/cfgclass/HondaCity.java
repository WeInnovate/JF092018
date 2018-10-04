package org.weinnovate.jf092018.spring.ioc.cfgclass;

public class HondaCity implements Car {

	public HondaCity() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	@Override
	public void driveTheCar() {
		System.out.println("Driving the " + this.getClass().getSimpleName());
	}
}
