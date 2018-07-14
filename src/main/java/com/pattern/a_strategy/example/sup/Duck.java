package com.pattern.a_strategy.example.sup;

import com.pattern.a_strategy.example.behavior.FlyBehavior;
import com.pattern.a_strategy.example.behavior.QuackBehavior;

/**
 * 策略模式
 * 
 * 鸭子超类
 * 
 * @创建时间：2018年7月5日
 */
public abstract class Duck {
	
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public Duck() {}
	
	public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}

	public void swim() {	// 提取不变的公共特性，方便复用
		System.out.println("swimming");
	}
	
	public abstract void display();	// 每个类型都有个性的实现
	
	public void performFly() {	// 不关注具体实现
		this.flyBehavior.fly();
	}
	
	public void performQuack() {
		this.quackBehavior.quack();
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
//	public abstract void fly();	
	// fly() 是变化的，并且变化类型是确定的，如果Duck的实现都去硬编码实现fly()方法，不符合代码复用原则
	// 策略模式便是解决这类问题的，把不同的实现看作是不同的策略，在程序运行过程中可以动态切换代码策略
	// 策略模式强调的是组合，组合要高于继承
	
//	public abstract void quack();
	
}
