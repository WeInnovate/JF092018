package org.weinnovate.jf092018.spring.di.xml;

public class HondaAmaze implements Car {

	private String color;

	private Engine engine;

	public String getColor() {
		return color;
	}

	public HondaAmaze(String color, Engine engine) {
		super();
		this.color = color;
		this.engine = engine;
		System.out.println(this.getClass().getSimpleName() + " is being manufactured. \n");
	}

	public HondaAmaze() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	@Override
	public void driveTheCar() {
		System.out.println("Driving the " + this.getClass().getSimpleName() + " of " + color + " color");
		engine.move();
	}
}
