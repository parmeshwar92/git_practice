package com.param.git.design.pattern.creational.builder;

public class BuilderDemo {
	
	public static void main(String[] args) {
		
		CDBuilder sdBuilder = new CDBuilder();
		
		CDType sonyCdType = sdBuilder.buildSonyCD();
		sonyCdType.showItems();
		sonyCdType.getCost();
		
		CDType samCdType = sdBuilder.buildSamsungCD();
		samCdType.showItems();
		samCdType.getCost();
		

	}

}
