package daytwo;

public class SwitchDemo {

	public static void main(String[] args) {
		char x = 'd';
		switch (x) 
		{
		case 'd':
		case 'D' :
			System.out.println(x+" is a Deva");
			break;
		case 'L' : 
		case 'l' : 
			System.out.println(x+" is a love");
			break;
		
		case 'w':
		case 'W' :	
			System.out.println(x+" is White shirt ");
			break;
		case 's':
		case 'S':
			System.out.println(x+" is Special for him");
		default:
			System.out.println(x+" is other than letter, digit, space or special symbol ");
			break;
		}

	}

}
