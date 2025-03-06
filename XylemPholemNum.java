import java.util.Scanner;
class XylemPholemNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = sc.nextInt();
		if(isXylem(n))
		{
			System.out.println(n+" is Xylem number");
		}
		else 
		{
			System.out.println(n+" is pholem number ");
		}
		
	}

	public static boolean isXylem(int num)
	{
		int sumExt= num%10;
		num/=10;

		int sumMid=0; 
		while(num>9)
		{
			sumMid+=num%10;
			num/=10;
		}
		sumExt+=num;

		return sumExt == sumMid;
	}
}