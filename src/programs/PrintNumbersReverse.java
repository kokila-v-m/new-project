package programs;

import java.util.Scanner;

public class PrintNumbersReverse {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      int n = sc.nextInt();
      for(int i =n;i>0;i--)
      {
    	  System.out.println(i);
      }

	}

}
