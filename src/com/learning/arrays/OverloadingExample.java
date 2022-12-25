package com.learning.arrays;

public class OverloadingExample {

	public static void main(String[] args) {
		A a=new A();
		//a.show(null);

	}

}

class A
{
	public void show(Integer i)
	{
		System.out.println("in integer");
	}
	public void show(String i)
	{
		System.out.println("in string");
	}
}