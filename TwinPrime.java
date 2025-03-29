import java.util.Scanner;
class TwinPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number: ");

		int n1=sc.nextInt();
		System.out.println("enter the second number: ");
		int n2=sc.nextInt();

		int max = n1>n2?n1-n2:n2-n1;

		if(max==2)
		{
			if(isPrime(n1) && isPrime(n2))
			{
				System.out.println(n1+" "+n2+" are twin prime numbers");
			}
			else 
			{
				System.out.println("not twin primes");
			}
		}
		else 
		{
			System.out.println(n1+" "+n2+" are not twin prime");
		}
	}

	public static boolean isPrime(int num)
	{
		int den =2;
		for( ; den<num ; den++)
		{
			if(num%den==0)
			{
				return false;
			}
		}
		return true;
		
	}
}