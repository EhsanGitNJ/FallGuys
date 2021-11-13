package personalPracticeAssignment3;

public class fizzBuzz1 {

	public static void main(String[] args) {
		
		int x = 45;
		
		if (x%3==0) {
			System.out.println("Fizz");	
		}
		if (x%5==0) {
			System.out.println("Buzz");
		}
		if ((x%3==0) && (x%5==0)) {
			System.out.println("FizzBuzz");
		}
		else {
			System.out.println("Other");
		}
		
		// TODO Auto-generated method stub

	}

}
