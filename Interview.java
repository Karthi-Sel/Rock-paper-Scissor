package org.inter;

import java.util.Scanner;

public class Interview {
	
	
	public static void main(String[] args) {
		String b = "";
		String c = "";

		Scanner sr = new Scanner(System.in);
		System.out.println("Enter the name");
		String l = sr.nextLine();
		String a = l;
		for (int i = a.length()-1; i >=00 ; i--) 
		{
			b= b+a.charAt(i);
		}
		c = b.replace("y", "");
		System.out.println(c);
	}


}
