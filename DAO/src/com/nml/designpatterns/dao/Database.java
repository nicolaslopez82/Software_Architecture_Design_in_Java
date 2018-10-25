package com.nml.designpatterns.dao;

import java.util.ArrayList;
import java.util.List;

public class Database implements PersonDAO{

	private List<Person> people;
	
	public Database(){
		this.people = new ArrayList<>();
	}
	
	@Override
	public void insert(Person person) {
		this.people.add(person);
	}

	@Override
	public void remove(Person person) {
		this.people.remove(person);
	}

	@Override
	public List<Person> getPeople() {
		return this.people;
	}
}
