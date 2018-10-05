package org.weinnovate.jf092018.spring.scope.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("car")
//@Scope("singleton")
@Scope("prototype")
public class HondaCity {

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public HondaCity() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	public void driveTheCar() {
		System.out.println("Driving the " + this.getClass().getSimpleName() + " of " + color + " color");
	}

}
