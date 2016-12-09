package CORE_JAVA_WELCOM;
//import java.util.Scanner;
public class core_java_session2_assignment2 {

	public static void main(String[] args) {
		//Scanner scan=new Scanner(System.in);
		int a=0,b=0,c=0,d=0;
		
		//System.out.println("Enter Limit:");
		//int int1 =scan.nextInt();
		/*================== top of triangle start =====================*/
		for(a=0;a<3;a++)	// line number loop
		{
			
			for(b=0;b<a;b++)	// left side space insert
			{
				System.out.printf("_");
			}
			System.out.printf("*");
			for(d=0;d<3-a;d++)		//center align
			{
				System.out.printf("_");
			}
			for(c=3;c>a-1;c--) // right side space enter
			{
				System.out.printf("_");
			}
			System.out.printf("*\n"); 
			
		}
		for(d=0;d<=a;d++) // center x mark
		{
			System.out.printf("_");
		}
		System.out.printf("*\n");
		
		/*================== top of triangle end =====================*/
		/*================== bottom of triangle end ==================*/
		for(a=0;a<3;a++)
		{
			for(c=2;c>a;c--) // right side space enter
			{
				System.out.printf("_");
			}
			System.out.printf("*");
			for(d=0;d<a+3;d++)
			{
				System.out.printf("_");
			}
			for(b=0;b<a;b++)
			{
				System.out.printf("_");
			}
			System.out.printf("*\n");
		}	
		//System.out.println(+int1);
		

	}

}
