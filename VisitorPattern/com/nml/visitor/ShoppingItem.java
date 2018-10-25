package com.nml.visitor;

public interface ShoppingItem {
	public double accept(ShoppingCartVisitor visitor);
}
