package com.pattern.strategy.behavior.impl;

import com.pattern.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {

	public void quack() {
		System.out.println("gua quack");
	}

}
