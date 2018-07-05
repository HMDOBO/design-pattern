package com.pattern.strategy.example.behavior;

/**
 * fly行为类
 * 
 * 将fly()动作从Duck超类中抽离出来
 * 
 * 具体的fly行为实现了FlyBehavior接口
 * 
 * @创建时间：2018年7月5日
 */
public interface FlyBehavior {

	public void fly();
	
}
