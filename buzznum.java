import java.util.Scanner;
class buzznum
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the number: ");
		int num = sc.nextInt();

		if((num%7==0)||(num%10==7))
		{
			System.out.println(num+" is a buzz number");
		}
		else 
		{
			System.out.println(num+"is not a buzz number");
		}
	}
}