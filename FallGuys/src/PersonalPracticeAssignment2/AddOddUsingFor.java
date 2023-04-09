package PersonalPracticeAssignment2;

public class AddOddUsingFor {

	public static void main(String[] args) {
		
		int y=70;
		int sum = 0;
		
		System.out.println("the sum of odd numbers from 50 to 70 is:");
		
		for (int i = 50; i<=70; i++) {
			if (i%2 !=0) {
				sum = sum+i;
			}
		}
		System.out.println(sum);
		
		
		
		// TODO Auto-generated method stub

	}

}
