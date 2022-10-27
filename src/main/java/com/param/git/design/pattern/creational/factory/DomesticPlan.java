package com.param.git.design.pattern.creational.factory;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DomesticPlan extends Plan {

	private String name;
	
	void getRate() {
      rate = 3.50;		
	}

}