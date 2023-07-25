package com.param.git.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	public static void main(String[] args) {

		SingletonPattern instanceOne = SingletonPattern.getSingletonPattern();
		System.out.println(
				"one : " + SingletonPattern.getSingletonPattern().hashCode());
		System.out.println(
				"two: " + SingletonPattern.getSingletonPattern().hashCode());

		SingletonPattern instanceTwo = null;
		try {
			Constructor[] constructors = SingletonPattern.class
					.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (SingletonPattern) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

}
