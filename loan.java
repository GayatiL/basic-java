import java.util.Scanner;
class loan
{


public static void main(String[] args) 
{

	Scanner sc = new Scanner(System.in);
	System.out.println("enetr the month: ");
	int month = sc.nextInt();

	int a = month/12;
	int b = month%12;

	String opt =(a +"."+b);
	System.out.println(opt);
}	
	
}
