import java.util.Scanner;
class productnum2
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enetr the number :");
		int num = sc.nextInt();
		int dup = num;
		int prod = 1;

		while (num>0)
		{
			int rem = num%10;
			prod*=rem;
			num/=10;
		}

		System.out.println(prod);
		System.out.println(dup);
	}
}