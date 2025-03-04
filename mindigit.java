import java.util.Scanner;
class mindigit
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the digit: ");
		int num = sc.nextInt();

		int min =9;

		for(int i =num ; i>0; i/=10)
		{
			int digit = i%10;

			if (min>digit)
				min = digit;
		}

		System.out.println("smallest number from "+ num + " is " +min);
	}
}