import java.util.Scanner;
class checkchar2
{
	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the charcter: ");

		ch = sc.next().charAt(0);

		String op = (ch>='A'&& ch<='Z')?(ch + " is an uppercase character"):(
			(ch>='a'&& ch <='z')?(ch + " is a lowercase character"):((ch >='0' && ch<='9')?(ch + " is a digit"):(" ")));
		System.out.println(op);
	}
}