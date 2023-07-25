package com.param.git.design.pattern.creational.factory;

public class GenerateBill {

	public static void main(String[] args) {

		GetPlanFactory gpf = new GetPlanFactory();
		
		Plan plan = gpf.getPlan("INSTITUTIONALPLAN");
		
		plan.getRate();
		
		System.out.println("rate ::  " + plan.rate);
		
	  plan.calculateBill(1000);
		
	}

}
