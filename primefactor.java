import java.util.Scanner;
class primefactor
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 1; i<=num ; i++){ 
		    int mod = num%i;                                         // to exclude 1 and num itself start thr loop from 2 and remove =

			if(mod==0)
			{
				System.out.print(i+" ");

				for (int j = 2; j<mod ; j++)
				{
					if(mod%j!=0)
					{
						System.out.println(j);
					}
					
				}
			}
		}
	}
}