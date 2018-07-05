package com.pattern.strategy.example.test;

import com.pattern.strategy.example.sup.Duck;
import com.pattern.strategy.example.behavior.impl.FlyNoWay;
import com.pattern.strategy.example.behavior.impl.Squack;
import com.pattern.strategy.example.sub.RedFlyQuackDuck;

/**
 * 策略模式，可以动态切换表现行为
 * 
 * @创建时间：2018年7月5日
 */
public class TestStrategyPattern {
	public static void main(String[] args) {
		Duck duck = new RedFlyQuackDuck();
		duck.display();
		duck.performFly();
		duck.performQuack();
		
		System.out.println("-------------");
		
		duck.setFlyBehavior(new FlyNoWay());
		duck.performFly();
		
		System.out.println("-------------");
		
		duck.setQuackBehavior(new Squack());
		duck.performQuack();
		
	}
}
