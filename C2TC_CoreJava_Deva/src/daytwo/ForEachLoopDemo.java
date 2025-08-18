package daytwo;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		
		int [] a= {10,20,30,40,50,60,70,80,90};
		//for integer array
				for(int i:a)
				{
				System.out.print(i+" ");	
				}
				System.out.println();
		char []ch = {'D','e','v','a','k','u','m','a','r','a','n'};
		for(char c:ch)
		{
			System.out.print(c);		
		}
		System.out.println(" ");
	
	String s1[]= {"Java","programming","learning"};
	//for String array
			for(String s:s1)
			{
				System.out.print(s+" ");		
			}
	}
}
