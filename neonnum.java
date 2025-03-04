import java.util.Scanner;
class neonnum
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the number");
		int num =sc.nextInt();
		int dup =num;
		int sum = 0;

		int sqr = num*num;
		for(int i = sqr; i>0; i/=10)
		{
			sum+=(i%10);
		}
    System.out.println(num==sum?"is a neon number":"not a neon number");

	  
	}

}