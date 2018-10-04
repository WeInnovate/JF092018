package org.weinnovate.jf092018.spring.di.annotation;

import org.springframework.stereotype.Component;

@Component
public class AshokaLeLand implements Engine {

	@Override
	public void start() {
		System.out.println(this.getClass().getSimpleName() + " is started.");
	}

	@Override
	public void move() {
		System.out.println(this.getClass().getSimpleName() + " is moving.");
	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName() + " is stoped.");
	}

	public AshokaLeLand() {
		super();
		System.out.println(this.getClass().getSimpleName() + " is being constructed.");
	}

}
