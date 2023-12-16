package com.prowings.immutableclass;

//#1 : Declare class as final - so that subclass can not change the internal state of object. 
public final class ImmutableStudent {

	// #2 : Declare all fields private (to restrict direct access to fields) & final
	// - to initialize only once

	private final int roll;
	private final String name;
	private final Address address;

	// #: Remove setter methods - as one can change internal state of object through
	// setters.

	public ImmutableStudent() {

		this.roll = 0;
		this.name = "";
		this.address = new Address();

	}

	public ImmutableStudent(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;

		// #4 : Creating deep copy of mutable field in constructor

		Address copyAddr = new Address();
		copyAddr.setPin(address.getPin());
		copyAddr.setCity(address.getCity());
		copyAddr.setCountry(address.getCountry());

		this.address = copyAddr;
	}

	public int getRoll() {
		return roll;

	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		// #5 : Returning dummy copy instead of original field in getter of mutable
		// field.
		Address dummyAddr = new Address();

		dummyAddr.setPin(this.address.getPin());
		dummyAddr.setCity(this.address.getCity());
		dummyAddr.setCountry(this.address.getCountry());

		return dummyAddr;

	}

	@Override
	public String toString() {
		return "ImmutableStudent [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}



}
