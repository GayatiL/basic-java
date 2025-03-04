import java.util.Scanner;
class factors
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = sc.nextInt();

		for (int i = 1; i<=num ; i++){          // to exclude 1 and num itself start thr loop from 2 and remove =

			if(num%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}