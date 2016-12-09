package CORE_JAVA_WELCOM;
import java.util.Scanner;
public class core_java_session2_assignment4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number 1:");// accept 1 st number
		int int1 =scan.nextInt();
		
		System.out.println("Enter Number 2:");// accept 2 nd number
		int int2 =scan.nextInt();
		
		System.out.println("Enter Number 3:");// accept 1 rd number
		int int3 =scan.nextInt();
		
		if(int1>int2)
		{
			if(int1>int3)
			{
				System.out.println("Number 1 is highest:" +int1);
			}
			
		}
		else if (int2>int3)
		{
			System.out.println("Number 2 is highest:" +int2);
		}
		else
		{
			System.out.println("Number  is highest:" +int3);
		}
		
		

	}

}
