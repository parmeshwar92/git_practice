package com.param.git.design.pattern.creational.factory;

public class GetPlanFactory {

	public Plan getPlan(String planType) {

		if (planType == null) {
			return null;
		}

		if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan(planType);
		} else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommercialPlan(planType);
		} else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan(planType);
		}
		return null;
	}
}
