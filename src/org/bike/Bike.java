package org.bike;

public class Bike {
	 public static void main(String[] args) {
		int a=0;
		int b=0;
		int num=12;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("not a prime ");
				
				b++;
				break;
			}
		}
         if(b==0) {
        	 System.out.println("prime");
         
         }
         else {
        	 System.out.println("not a prime");
         }
         
         System.out.println("MODIFIED");
}
}