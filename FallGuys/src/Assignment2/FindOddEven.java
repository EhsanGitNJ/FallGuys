package Assignment2;

import java.util.Scanner;


public class FindOddEven {

	public static void main(String[] args) {
		
		int number,remainder;
		System.out.println("Pls enter an Int number");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		scan.close();
		
		remainder = number % 2; 
		
		if(remainder ==0)
			System.out.println("Even Number");
		else 
			System.out.println("Odd Number");
		
		
		
		// TODO Auto-generated method stub

	}

}
