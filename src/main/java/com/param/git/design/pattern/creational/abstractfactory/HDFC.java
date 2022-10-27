package com.param.git.design.pattern.creational.abstractfactory;

class HDFC implements Bank {

	private final String BNAME;

	public HDFC() {
		BNAME = "HDFC BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}
