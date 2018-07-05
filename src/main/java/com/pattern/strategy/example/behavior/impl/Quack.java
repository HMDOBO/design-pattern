package com.pattern.strategy.example.behavior.impl;

import com.pattern.strategy.example.behavior.QuackBehavior;

public class Quack implements QuackBehavior {

	public void quack() {
		System.out.println("gua quack");
	}

}
