package PersonalPracticeAssignment2;

public class SwapVal {

	public static void main(String[] args) {
		
		int x = 25;
		int y = 35;
		
		int temp;
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x is " + x + " and y is " + y);
		
		
		x = 25;
		y = 35;
		
		x = x + y; //60
		y = x - y; //60-35 = 25
		x = x - y; //60 - 25
		
		
		System.out.println("x is " + x + " and y is " + y);
		
		
		// TODO Auto-generated method stub

	}

}
