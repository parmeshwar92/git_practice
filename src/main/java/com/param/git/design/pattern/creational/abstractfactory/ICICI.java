package com.param.git.design.pattern.creational.abstractfactory;

public class ICICI implements Bank {
	
	private final String BNAME;

	ICICI() {
		BNAME = "ICICI BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}
