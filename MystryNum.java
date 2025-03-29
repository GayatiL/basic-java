import java.util.Scanner;
class MystryNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num =sc.nextInt();

		if(isMystry(num))
		{
			System.out.println(num+" is mystry number");

		}
		else 
		{
			System.out.println(num+" not mystry number");
		}
		
	}
	public static int reverse(int num)
	{
		int rev = 0;
		for(int i= num; i>0; i/=10)
		{
			rev = rev*10 + i%10;
		}
		return rev;
	}

	public static boolean isMystry(int num)
	{

		for(int i = 1; i<num ; i++)
		{
			if(i+reverse(i)==num)
			{
				return true;

			}
		}
		return false;
	}
}