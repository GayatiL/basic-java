import java.util.Scanner;
class DuckNum
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the number: ");
		String num = sc.next();

		if(num.charAt(0) =='0')
		{
			System.out.println(num+" not a duck number");
		}
		else 
		{
			if(num.contains("0"))
			{
				System.out.println(num+" is a duck number");
			}
			else 
			{
				System.out.println(num+ " is not a duck number");
			}
		}


	}
}