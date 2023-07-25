package com.param.git.design.pattern.creational.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {

		EmployeeRecord e1 = new EmployeeRecord(1, "aa", "clerk", 2220.0, "abc street,gk");

		e1.showRecord();
		System.out.println("\n");

		EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
		e2.showRecord();
		
		
		///another example
		
		ShapeCache.loadCache();

    Shape clonedShape = (Shape) ShapeCache.getShape("1");
    System.out.println("Shape : " + clonedShape.getType());		

    Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
    System.out.println("Shape : " + clonedShape2.getType());		

    Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
    System.out.println("Shape : " + clonedShape3.getType());	

	}

}
