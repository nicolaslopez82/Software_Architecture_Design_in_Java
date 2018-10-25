package com.nml.visitor;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<ShoppingItem> items = new ArrayList<>();
		items.add(new Table("table",22));
		items.add(new Table("table",3));
		items.add(new Table("table",2));
		items.add(new Chair("chair",45));
		
		double sum = 0;
		ShoppingCartVisitor shoppingCart = new ShoppingCart();
		
		for(ShoppingItem shoppingItem : items)
			sum = sum + shoppingItem.accept(shoppingCart);
		
		System.out.println(sum);
	}
}
