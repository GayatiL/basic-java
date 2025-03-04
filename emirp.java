import java.util.Scanner;
class emirp
{
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("enetr the number:");
		int num = sc.nextInt();
		int dup=num;
		int rev =0;

		while(num>0)
				{
					int rem=num%10;
					 rev = rev*10+rem;
					num/=10;

				
				}
				System.out.println(rev);

		
        
        
		for(int i = 2; i<dup; i++){
			if(dup%i==0)
			{
				System.out.println("number is not prime");
				break;
			}
			else 
			{
				
				for(int j = 2; j<rev; j++)
				{
					if(rev%j==0)
					{
						System.out.println("number is  emirp number");
						break;
					}
				}

				System.out.println("num is prime");
				break;


			}
		}
	}
}
