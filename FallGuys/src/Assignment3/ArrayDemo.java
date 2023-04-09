package Assignment3;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		int []score= {99, 98, 78, 65, 100, 62, 35, 99, 92, 88};
		int max= -1;
		
		for (int i=0; i<score.length; i++) {
			if (max<score[i])
				max = score[i];
		}
		
		System.out.println(max);
		// TODO Auto-generated method stub

	}

}
