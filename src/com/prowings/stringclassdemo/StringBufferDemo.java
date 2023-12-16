package com.prowings.stringclassdemo;

public class StringBufferDemo {

	public static void main(String[] args) {

		String s = "Hello";// immutable
		System.out.println(s);

		s = s.concat("world"); // make new object as string is immutable
		System.out.println(s);

		StringBuffer sb = new StringBuffer("Hello");
		sb.append("World");// does not change referance like string as it is mutable, make change in
							// original
		System.out.println(sb);

		System.out.println("length:" + sb.length());
		System.out.println("capacity :" + sb.capacity());

		StringBuilder sbd = new StringBuilder("Hello");// mutable
		sbd.append("World");
		System.out.println(sbd);

	}

}
