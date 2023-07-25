package com.param.git.design.pattern.creational.factory;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommercialPlan extends Plan{
	
	private String name;

	void getRate() {
        rate= 7.5;		
	}

}
