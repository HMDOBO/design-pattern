package com.pattern.strategy.sub;

import com.pattern.strategy.sup.Duck;
import com.pattern.strategy.behavior.impl.FlyWithWings;
import com.pattern.strategy.behavior.impl.Quack;

/**
 * 具体Duck类
 * 
 * 红色，会飞，会叫
 * 
 * @创建时间：2018年7月5日
 */
public class RedFlyQuackDuck extends Duck {
	
	public RedFlyQuackDuck() {
		super(new FlyWithWings(), new Quack());
	}

	@Override
	public void display() {
		System.out.println("red duck");
	}

}
