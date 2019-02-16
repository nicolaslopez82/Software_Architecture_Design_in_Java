package com.nml.builder;

public class Person {

	private final String name;
	private final String email;
	private final String address;
	private final int age;
	private final String nameOfMother;
	private final String university;
	
	public Person(Builder builder){
		this.name = builder.name;
		this.email = builder.email;
		this.address = builder.address;
		this.age = builder.age;
		this.nameOfMother = builder.nameOfMother;
		this.university = builder.university;
	}
	
	public static class Builder {
		
		private final String name;
		private final String email;
		private String address;
		private int age;
		private String nameOfMother;
		private String university;
		
		public Builder(String name, String email, String university){
			this.name = name;
			this.email = email;
			this.university = university;
		}
		
		public Builder setAddress(String address){
			this.address = address;
			return this;
		}
		
		public Builder setNameOfMother(String nameOfMother){
			this.nameOfMother = nameOfMother;
			return this;
		}
		
		public Builder setAge(int age){
			this.age = age;
			return this;
		}

//		public Builder setUniversity(String university){
//			this.university = university;
//			return this;
//		}
		
		public Person build(){
			return new Person(this);
		}
	}
	
	@Override
	public String toString() {
		return this.name+"-"+this.address+"-"+this.email+"-"+this.age+"-"+this.university;
	}
}
