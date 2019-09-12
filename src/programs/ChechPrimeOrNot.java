package programs;

import java.util.Scanner;

public class ChechPrimeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check whether number is prime or not");
		int n =  sc.nextInt();
     if(n==1)
     {
    	System.out.println("prime number starts from 2"); 
     
     for(int j=2;j<n;j++)
     {
    	 if(n%j==0)
    	 {
    		 System.out.println("number is prime");
    	 }
     }
     }
    	 else
    	 {
    		 System.out.println("not prime");
    	 }
     }
	}


