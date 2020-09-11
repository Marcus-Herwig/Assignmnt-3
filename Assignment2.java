import java.util.Scanner;
public class Assignment2 
{
	public static void main(String[] args)
	{
		Scanner Num = new Scanner(System.in);
				System.out.print("Enter number: ");
				String input = Num.nextLine();
				int num = Integer.parseInt(input);
				int divisor = 0;
				int remainder = 0;
				String num2 = "";
				String num3 = "";
				do
				{
					divisor = num / 2;
					remainder = num % 2;
					num2 = Integer.toString(remainder);
					num3 = num2 + num3;
					num = divisor;
					
				}
				while( num > 0);
				System.out.println(num3);
				
				
		
				
	}
}

	
