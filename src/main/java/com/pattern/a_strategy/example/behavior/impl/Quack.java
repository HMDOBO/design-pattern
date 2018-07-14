package com.pattern.a_strategy.example.behavior.impl;

import com.pattern.a_strategy.example.behavior.QuackBehavior;

public class Quack implements QuackBehavior {

	public void quack() {
		System.out.println("gua quack");
	}

}
