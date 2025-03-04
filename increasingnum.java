import java.util.Scanner;
class increasingnum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the num: ");
		int num = sc.nextInt();
		int dup = num;
		int rev1=0 , rev2=0;
		boolean flag = false;


		for(int i = num; i>0; i/=10)
		{
			rev1= i%10;

			for(int j = num ; j>0; j/=10)
			{
				rev2 = j%10;
			}
			
			if(rev2<rev1)
			{
				flag= true;
			}
		}

		if(flag)
		{
			System.out.println(dup+" is an increasing number");
		}
		else 
		{
			System.out.println(dup+"  is not an increasing number");
		}
	}
}