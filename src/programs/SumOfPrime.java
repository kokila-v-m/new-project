package programs;

import java.util.Scanner;

public class SumOfPrime {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the range to print sum of prime numbers");
 int n = sc.nextInt();
 int sum=0;
 for(int i=1;i<n;i++ )
 {
	 if(isPrime(i))
	 sum=sum+i;
		 
	 }
 System.out.println(sum);
 }

	private static boolean isPrime(int num) {
		if(num==1)
			return false;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

	
 
 
 
	}


