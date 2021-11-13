package Assignment2;

public class SwapValues {

	public static void main(String[] args) {
		
		int x = 75;
		int y = 35;
		
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x is " + x + " and y is " + y);
		
		
		x = 25;
		y = 35;
		
		x = x + y; // x = 60
		y = x - y; // y = 60 - 35 = 25
		x = x - y; // x = 60 - 25 = 35
		
		System.out.println("x is " + x + " and y is " + y);
		
		// Swap Values

	}

}
