import java.util.Scanner;
class automorphicnum
{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the number: ");
		int num = sc.nextInt();
		int len = 0;
		int div = 1; 
		for(int i = num;i>0; i/=10)
		{
			len++;
		}
		for(int i =1; i<=len; i++)
		{
			div*=10;
		}
		if(num == (num*num)%div)
			System.out.println(num+" is automorphic number");
		else 
			System.out.println(num+" is not am automorphic number");
	}
}