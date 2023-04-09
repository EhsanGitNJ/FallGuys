package Assignment2;

public class CompareTwoValues {
	
	public void CompareValues() {
	
		int x=55;
		int y=85;
		
		
		if (x>y) {
			System.out.println("x is bigger");
	}
		else if (x<y) {
			System.out.println("y is bigger");
		}
		
		else if (x==y) {
			System.out.println("both are same");
		}
		else {
			System.out.println("Error");
		}
	}
			

	public static void main(String[] args) {
		
		CompareTwoValues obj=new CompareTwoValues();
		
		obj.CompareValues();
		
		// TODO Auto-generated method stub

	}

}
