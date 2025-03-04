import java.util.Scanner;
class hitwohifive
{
	public static void main(String[] args) {
		
		int num ;
		 Scanner sc = new Scanner(System.in);

		System.out.println("enter the number: ");
		num = sc.nextInt();


        
		 String op = (num%2==0)?((num%5==0)?("hitwohifive"):("hitwo")):((num%5==0)?("hifive"):("  "));

		 System.out.println(op);
	}
}
