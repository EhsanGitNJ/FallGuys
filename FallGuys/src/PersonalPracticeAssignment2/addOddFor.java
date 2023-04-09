package PersonalPracticeAssignment2;

public class addOddFor {

	public static void main(String[] args) {
		
		int sum=0;
		
		for (int i=50; i<=70; i++) {
			if (i%2==1) {
				sum = sum+i;
			}
		}
		System.out.println("sum of odd numbers from 50 to 70 is " +sum);
		
		// TODO Auto-generated method stub

	}

}
