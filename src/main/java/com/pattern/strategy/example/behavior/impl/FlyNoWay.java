package com.pattern.strategy.example.behavior.impl;

import com.pattern.strategy.example.behavior.FlyBehavior;

/**
 * fly行为具体实现
 * 
 * @创建时间：2018年7月5日
 */
public class FlyNoWay implements FlyBehavior{

	public void fly() {
		System.out.println("fly no way");
	}

}
