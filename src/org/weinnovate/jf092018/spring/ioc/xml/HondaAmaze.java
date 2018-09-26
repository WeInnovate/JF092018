package org.weinnovate.jf092018.spring.ioc.xml;

public class HondaAmaze {

	private String color;

	public String getColor() {
		return color;
	}

	public HondaAmaze(String color) {
		super();
		this.color = color;
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	public HondaAmaze() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	public void driveTheCar() {
		System.out.println("Driving the " + this.getClass().getSimpleName() + " of " + color + " color");
	}
}
