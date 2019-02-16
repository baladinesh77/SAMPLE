package com.funtionalintrfce;

import java.util.function.Consumer;
import java.util.function.Function;

public class Person {
	
	private String firstName;
	private String lastName;
	private String middleName;
	
//	private NameFormatter  nameformater;
	
	

	public Person(String firstName, String lastName, String middleName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/*public NameFormatter getNameformater() {
		return nameformater;
	}

	public void setNameformater(NameFormatter nameformater) {
		this.nameformater = nameformater;
	}*/

	/*public void print(Consumer<Person> nf) {
		nf.accept(this);
		
	}*/
	
	public void print(Function<Person, String> fn) {
		fn.apply(this);
		System.out.println(fn.apply(this));
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName;
	}
	

}
