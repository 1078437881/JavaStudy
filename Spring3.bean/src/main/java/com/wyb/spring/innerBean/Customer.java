package com.wyb.spring.innerBean;


public class Customer {

	private Person person;

	public Customer(Person person) {
		this.person = person;
	}

	public Customer() {

	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {

		return "Customer [person=" + person + "]";
	}
}
