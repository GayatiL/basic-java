import java.util.Scanner;
class SpyNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = sc.nextInt();
        int dup = num;
        int sum = 0;
        int mulp = 1;

        for(int i =num; i>0; i/=10)
        {
        	int rem =i%10;
        	sum+=rem;
        	mulp*=rem;
        }
        System.out.println(sum==mulp?(num+" is a Spy number"):(num+" is not a spy number"));
       

	}
}