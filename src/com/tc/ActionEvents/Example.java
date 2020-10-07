package com.tc.ActionEvents;

class A {

	public Object add(int a){
		System.out.println("Parent - Add Method");
		return 1;
	}
	
}

class B extends A{
	
	public String add(int a){
		System.out.println("Child - Add Method");
		return "Ananth";
	}
	
	
}

public class Example{
	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.add(3));
	}
}
