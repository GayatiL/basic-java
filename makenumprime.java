import java.util.Scanner;
class makenumprime
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int deno = 2;

		while (deno<num)
		{
			if(num%deno==0)
			{
				break;
			}
			deno++;
		}
		if (num==deno)
		{
			System.out.println("prime number");
		}
		else{
			System.out.println("not prime");
		}
	}

}