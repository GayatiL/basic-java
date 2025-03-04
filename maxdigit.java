import java.util.Scanner;
class maxdigit
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the digit: ");
		int num = sc.nextInt();

		int max =0;

		for(int i =num ; i>0; i/=10)
		{
			int digit = i%10;

			if (max<digit)
				max = digit;
		}

		System.out.println("largest num from "+ num + " is " +max);
	}
}