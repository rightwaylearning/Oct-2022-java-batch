package com.fc.student.info;

public class Address {

	String addressLine1;
	String addressLine2;
	
	public Address() {
		System.out.println("I am default constructor");
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + "]";
	}
	
	public void m1() {
		System.out.println("I am address bean");
	}

}
