package com.balazsholczer.designpatterns;

public class NameIterator implements Iterator {
	
	private String[] names;
	private int index;
	
	public NameIterator(String[] names){
		this.names = names;
	}
	
	@Override
	public boolean hasNext() {
		return index < this.names.length;
	}
	
	@Override
	public Object next() {
		
		if( hasNext() ){
			return this.names[index++];
		}
		
		return null;
	}
}
