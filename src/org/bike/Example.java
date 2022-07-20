package org.bike;

import java.util.Scanner;

public class Example {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("ENTER A NUMBER");
	int a1 = s.nextInt();
	
	//int a =a1/2;
	int b=0;
	for(int i=2;i<a1;i++) {
		if(a1%i==0) {
			b=1;
			break;
		}
	}
	  if(b==0) {
		  System.out.println("prime");
	  }
	  else {
		  System.out.println("not a prime");
	  }
}}
