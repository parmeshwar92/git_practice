package com.param.git.design.pattern.creational.singleton;

public class SingletonPattern {

	private static SingletonPattern obj;

	private SingletonPattern(){}

	public static SingletonPattern getSingletonPattern() {
		if (obj == null) {
			synchronized (SingletonPattern.class) {
				if (obj == null) {
					obj = new SingletonPattern();// instance will be created at request time
				}
			}
		}
		return obj;
	}

	public void doSomething() {
		// write your code
	}
}
