package com.param.git.design.pattern.creational.abstractfactory;

public abstract class AbstractFactory {
	
	public abstract Bank getBank(String bank);  
	
  public abstract Loan getLoan(String loan); 
  
}
