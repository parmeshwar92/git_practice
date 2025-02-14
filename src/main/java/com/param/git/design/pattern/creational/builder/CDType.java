package com.param.git.design.pattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class CDType {
	private List<Packing> items = new ArrayList<>();

	public void addItem(Packing packs) {
		items.add(packs);
	}

	public void getCost() {
		for (Packing packs : items) {
			packs.price();
		}
	}

	public void showItems() {
		for (Packing packing : items) {
			System.out.print("CD name : " + packing.pack());
			System.out.println(", Price : " + packing.price());
		}
	}
}
