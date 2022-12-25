package com.learning.recursion;

import java.util.Scanner;

public class ReverseString {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the string to reverse it");
        String str=s.next();
        System.out.println(reverse(str,str.length()-1));
	}
	
	private static String reverse(String str,int i)
	{
		if(i==0)
			return String.valueOf(str.charAt(0));
		return String.valueOf(str.charAt(i))+reverse(str,i-1);
	}

}
