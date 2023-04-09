package Assignment3;

public class arraydemoMin {

	public static void main(String[] args) {
		
		
		int []score= {99, 98, 78, 65, 100, 62, 35, 99, 92, 88};
		int min= 1000;
		
		for (int i=0; i<score.length; i++) {
			if (min>score[i])
				min = score[i];
		}
		
		System.out.println(min);
		
		
		// TODO Auto-generated method stub

	}

}
