package Day2;

public class DoWhileDemo {

	public static void main(String[] args) {
		
		int i = 1;
		do {
			System.out.println(i);
			i++;
			if (i == 5) {
				break;
			}
		} while (i > 1);

	}

}
