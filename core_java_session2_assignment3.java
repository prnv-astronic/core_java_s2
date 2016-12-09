package CORE_JAVA_WELCOM;

public class core_java_session2_assignment3 {

	public static void main(String[] args) {
int a=0,b=0,c=0,d=0;
char val='a';
		
		//System.out.println("Enter Limit:");
		//int int1 =scan.nextInt();

// left top part of 
	for(a=0;a<3;a++)
	{
		for(b=3-a;b>0;b--)
		{
			System.out.printf(" ");
		}
		for(c=0;c<=a;c++)
		{
			System.out.printf("%c",val++);
			
		}
		val=(char) (val-2);		
		for(c=1;c<=a;c++) // right top part
		{
			System.out.printf("%c",val--);
			
		}
		System.out.printf("\n");
		val='a';
		
	}
	for(a=0;a<2;a++) 
	{
		for(b=0;b<a+2;b++)// bottom left
		{
			System.out.printf(" ");
		}
		for(c=2;c>a;c--)
		{
			System.out.printf("%c",val++);
			
		}
		val=(char)(val-2);		
		for(c=1;c>a;c--)// bottom right
		{
			System.out.printf("%c",val--);
			
		}
		System.out.printf("\n");
		val='a';
		
	

	}

	}

}
