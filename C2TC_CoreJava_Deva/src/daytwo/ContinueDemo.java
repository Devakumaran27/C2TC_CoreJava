package daytwo;

public class ContinueDemo {

	public static void main(String[] args) {
		
//		even numbers are skipped 
		for (int i = 0 ;i<10;i++) {
			if (i%2 == 0 ) {
				continue;
		
		}
			System.out.print(i);
			System.out.print(" ");
	}
		System.out.println();
		System.out.println("The above numbers are odd number ");

		for (int j = 0 ;j<10;j++) {
			if (j%2 != 0 ) {
				continue;
		
		}
			System.out.print(j);
			System.out.print(" ");
}
		System.out.println();
		System.out.println("The above numbers are even number ");
}
}