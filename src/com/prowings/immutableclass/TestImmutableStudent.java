package com.prowings.immutableclass;

public class TestImmutableStudent {

	public static void main(String[] args) {
		Address addr=new Address(123, "pune", "India");
		
		
		ImmutableStudent s = new ImmutableStudent(10,"Bhushan", addr);
		
		System.out.println(s);
		
		//addr.setCity("mumbai");
		
		s.getAddress().setCity("mumbai");
		
		System.out.println(s);
	}

}
